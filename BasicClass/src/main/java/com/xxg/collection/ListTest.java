package com.xxg.collection;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {

        //new 时对应的关键字应该是import生成的一个对象，总之new是编译时处理的。
        ArrayList<String> a = new ArrayList<String>();

        ArrayList<String> b = new ArrayList<String>();
        a.add("hello");
        a.add("world");
        for (String i : a) {
            System.out.println(i);
        }
    }
}
