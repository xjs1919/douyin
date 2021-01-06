package com.github.xjs.douyin.demo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListDelete {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("b2");list.add("c4566");
        list.add("d1");list.add("e2");list.add("f4566");
        delete1_error(list);
        delete1_ok(list);
        delete2_error(list);
        delete2_ok(list);
        delete3(list);
    }
    public static void delete1_error(List<String> list){
        for(String elem : list){
            if(elem.length() == 2){
                list.remove(elem);
            }
        }
        System.out.println(list);
    }
    public static void delete1_ok(List<String> list){
        for(Iterator<String> it = list.iterator(); it.hasNext(); ){
            String elem = it.next();
            if(elem.length() == 2){
                it.remove();
            }
        }
        System.out.println(list);
    }
    public static void delete2_error(List<String> list){
        for(int i=0; i<list.size(); i++){
            String elem = list.get(i);
            if(elem.length() == 2){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    public static void delete2_ok(List<String> list){
        for(int i=0; i<list.size(); i++){
            String elem = list.get(i);
            if(elem.length() == 2){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    public static void delete3(List<String> list){
        List<String> ret = list.stream()
                .filter((elem)->elem.length() != 2)
                .collect(Collectors.toList());
        System.out.println(ret);
    }
}
