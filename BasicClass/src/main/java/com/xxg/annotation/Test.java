package com.xxg.annotation;

import java.lang.reflect.Method;

public class Test {
    @Todo(id = 1, desc = "hello wolrd")
    public void method1() {

    }

    @Todo(id= 2)
    public void method2() {}

    public static void main(String[] args) {
        Method[] methods = Test.class.getDeclaredMethods();

        for (Method method: methods) {
            boolean hasAnotation = method.isAnnotationPresent(Todo.class);
            if (hasAnotation) {
                Todo anotation = method.getAnnotation(Todo.class);
                StringBuilder str = new StringBuilder();
                str.append("method name is ");
                str.append(method.getName());
                str.append("   id is ");
                str.append(anotation.id());
                System.out.println(str);
            }
        }
    }
}
