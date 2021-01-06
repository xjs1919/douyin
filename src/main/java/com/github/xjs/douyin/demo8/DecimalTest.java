package com.github.xjs.douyin.demo8;

import java.math.BigDecimal;

public class DecimalTest {
    public static void main(String args[]){

        System.out.println(2.00 - 1.10);

        BigDecimal ret = new BigDecimal(2).subtract(new BigDecimal(1.1));
        System.out.println(ret);

        BigDecimal ret2 = new BigDecimal(2).subtract(new BigDecimal("1.1"));
        System.out.println(ret2);

    }
}
