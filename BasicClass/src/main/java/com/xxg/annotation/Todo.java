package com.xxg.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)

@Documented

@Inherited
public @interface Todo {
    public int id();
    public String desc() default "hello";
}
