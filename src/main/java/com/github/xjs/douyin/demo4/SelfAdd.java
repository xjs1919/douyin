package com.github.xjs.douyin.demo4;

public class SelfAdd {
    public static void main(String[] args) {
        System.out.println(sum1());
        System.out.println(sum2());
    }
    public static int sum1(){
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += i;
        }
        return sum;
    }
    public static int sum2(){
        int sum = 0;
        for(int i=0; i<10; ++i){
            sum += i;
        }
        return sum;
    }
}
