package com.github.xjs.douyin.demo6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCopy {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = new ArrayList<>();
        Collections.copy(list2, list);
        System.out.println(list2);
    }



    public static <T> List<T> copy(List<T> list) {
        List<T> dst = new ArrayList<>(list.size());
        for(T t : list){
            dst.add(t);
        }
        return dst;
    }
}
