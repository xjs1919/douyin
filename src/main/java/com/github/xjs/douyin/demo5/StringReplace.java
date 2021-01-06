package com.github.xjs.douyin.demo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplace {
    public static void main(String[] args) {
        replace1();
        replace2();
//        replace3();
        replace4();
//        replace5();
    }

    public static void replace1(){
        String str = "aa.bb.cc";
        System.out.println(str.replaceAll(".","#"));
    }

    public static void replace2(){
        String str = "aa.bb.cc";
        System.out.println(str.replaceAll("\\.","#"));
        System.out.println(str.replaceAll(Pattern.quote("."),"#"));
        System.out.println(str.replace(".","#"));
    }

    public static void replace3(){
        String str = "aa.bb.cc";
        System.out.println(str.replaceAll(Pattern.quote("."),"$"));
    }

    public static void replace4(){
        String str = "aa.bb.cc";
        System.out.println(str.replaceAll(Pattern.quote("."), Matcher.quoteReplacement("$")));
    }

    public static void replace5(){
        String str = "aa.bb.cc";
        System.out.println(str.replaceAll("\\.", "\\$"));
    }
}
