package com.github.xjs.douyin.demo3;

public class StringJoin {
    public static void main(String[] args) {
        System.out.println(join1());
        System.out.println(join2());
    }
    public static String join1(){
        String str = "";
        for(int i=0; i<10; i++){
            str += "hello";
        }
        return str;
    }
    public static String join2(){
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<10; i++){
            str.append("hello");
        }
        return str.toString();
    }
}
