package com.xxg.io;

import java.io.*;

public class ObjectOutputDemo {

	public static void main(String[] args) {

		String s = "Hello world!";
		int i = 897648764;
		try {

			// create a new file with an ObjectOutputStream
			FileOutputStream out = new FileOutputStream("res/test.txt");
			ObjectOutputStream obj_out = new ObjectOutputStream(out);

			// write something in the file
			obj_out.writeObject(s);
			obj_out.writeObject(i);
			obj_out.writeObject(new String("你好"));

			// close the stream
			obj_out.close();

			// create an ObjectInputStream for the file we created before
			ObjectInputStream obj_input =
					new ObjectInputStream(new FileInputStream("res/test.txt"));

			// read and print what we wrote before
//			System.out.println("" + (String) obj_input.readObject());
			System.out.println("" + obj_input.readObject());
			System.out.println("" + obj_input.readObject());
			System.out.println("" + obj_input.readObject());


		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
