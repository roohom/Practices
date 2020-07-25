package com.roohom.demo;

public class test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("ABC");
        StringBuilder sb = new StringBuilder();
        sb.append("ABC");
        sb.reverse();
        System.out.println(sb.toString());

        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());
    }
}