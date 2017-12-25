package com.xxg.object;

import java.io.*;

class Employee implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public void mailCheck()
   	{
      System.out.println("Mailing a check to " + name
                           + " " + address);
   	}
}

public class SerializeDemo
{
   public static void main(String [] args) throws ClassNotFoundException {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("res/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);//格式化对象，并输出到文件流中，通过文件流输出到文件中。
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in employee.ser");

         FileInputStream fileIn = new FileInputStream("res/employee.ser");
         ObjectInputStream objIn = new ObjectInputStream(fileIn);
         Employee obj = (Employee)objIn.readObject();
         System.out.println(obj.name);
	  }catch(IOException i)
      	{
          i.printStackTrace();
      	}
   }
}
