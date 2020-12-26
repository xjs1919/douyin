package com.github.xjs.douyin.demo2;

public class ReferenceTest2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("world");
        test(s1, s2);
        System.out.println(s1 + " " + s2);
    }
    public static void test(StringBuilder s1, StringBuilder s2){
        s1 = new StringBuilder("若鱼");
        s2 = s2.append("你好");
        System.out.println(s1 + " " + s2);
    }
}
