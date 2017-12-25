package com.xxg.object;
public class ObjectTest implements Cloneable{
	Object o1 = new Object();

	// @Override
	// protected ObjectTest clone() throws CloneNotSupportedException {
 //        return (ObjectTest) super.clone();
 //    }

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {  
    	ObjectTest p1 = new ObjectTest();

    	// Object.getClass 获取当前对象的运行类，可用于反射
        System.out.println(p1.o1.getClass());

        // Object.equals() 判断对象相等性,默认和==作用类似，可重载，String重载了此方法
        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        

        /*
        	Object.hashCode() 可以获取当前对象的hash码，对于一般的数据结构用处不大，
        	但是对于集合类数据结构用处很大，特别是对于大量数据查找，如果每次直接采用
        	equals判断则是很慢的，但是先通过计算对象的hashCode,然后查看此hashCode处是否
        	有值且相等，然后再进行相等判断，大大减少相等判断次数。
        */

        /*
			对于重载了equals方法的对象，应该也需要重载hashCode方法，如果在集合中使用这些
			对象，首先是判断hashCode，然后才调用equal方法，要想使得equal方法生效，必须先
			重载hashCode方法。String重载了hashCode方法。
        */
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

        /*
        	对象clone是编程中常见的需求，同时克隆必不可少会产生浅克隆和深克隆的问题。
        	clone方法产生对象的好处就是较new方法快速一些，因为是本地方法。
        */
        System.out.println((ObjectTest)p1.clone() == p1);

    }  
}