package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        // java: name has private access in com.driver.RWOnly

        rw.setName("Yani");

        String name1 = rw.getName();

        System.out.println(name1);
    }
}