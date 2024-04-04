package com.itheima.springbootwebfirststart.controller;

public class hello {
    public void printHello(){
        System.out.println("蓝天翔");
    }

    public static String getName(){
        return "蓝天翔";
    }

    public static void main(String[] args) {
        String name = getName();
    }

}
