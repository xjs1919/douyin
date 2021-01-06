package com.github.xjs.douyin.demo5;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String[] args) {
//        split1();
        split2();
        split3();
        split4();
        split5();
    }

    public static void split1(){
        String str = "aa..bb.";
        String arr[] = str.split(".");
        System.out.println(arr.length + ":" + Arrays.toString(arr));
    }

    public static void split2(){
        String str = "aa..bb.";
        String arr[] = str.split("\\.");
        System.out.println(arr.length + ":" + Arrays.toString(arr));
    }

    public static void split3(){
        String str = "aa..bb.";
        String arr[] = str.split(Pattern.quote("."));
        System.out.println(arr.length + ":" + Arrays.toString(arr));
    }

    public static void split4(){
        String str = "aa..bb.";
        String arr[] = str.split(Pattern.quote("."), -1);
        System.out.println(arr.length + ":" + Arrays.toString(arr));
    }

    public static void split5(){
        String str = "aa..bb.";
        String arr[] = str.split(Pattern.quote("."), 2);
        System.out.println(arr.length + ":" + Arrays.toString(arr));
    }

}
