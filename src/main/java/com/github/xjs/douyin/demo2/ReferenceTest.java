package com.github.xjs.douyin.demo2;

public class ReferenceTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        test(s1, s2);
        System.out.println(s1 + " " + s2);
    }
    public static void test(String s1, String s2){
        s1 = "若鱼";
        s2 = s2 + "你好";
        System.out.println(s1 + " " + s2);
    }

}
