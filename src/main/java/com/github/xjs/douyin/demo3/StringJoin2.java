package com.github.xjs.douyin.demo3;

public class StringJoin2 {
    public static void main(String[] args) {
        System.out.println(join1());
        System.out.println(join2());
    }
    public static String join1(){
        String s1 = "hello";
        String s2 = "world";
        return s1 + s2;
    }
    public static String join2(){
        StringBuilder sb = new StringBuilder();
        String s1 = "hello";
        String s2 = "world";
        return sb.append(s1).append(s2).toString();
    }
    public static String join3(){
        final String s1 = "hello";
        final String s2 = "world";
        return s1 + s2;
    }
}
