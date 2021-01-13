package com.test;

public class Parent implements Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.geti();
    }


    public int value = 5;

    public Child child = new Child();

    public static void method(String str) {
        System.out.println("parent " + str);
    }

    @Override
    public Parent clone() throws CloneNotSupportedException {
        return (Parent) super.clone();
    }
}
