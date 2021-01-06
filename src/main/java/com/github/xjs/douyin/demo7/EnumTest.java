package com.github.xjs.douyin.demo7;

import java.util.EnumSet;
import java.util.Set;

public class EnumTest {

    public enum GenderEnum{
        MALE, FEMALE;
    }

    public static void main(String[] args) {
        GenderEnum male = GenderEnum.valueOf("MALE");
        System.out.println(male);

        GenderEnum boy = GenderEnum.valueOf("BOY");
        System.out.println(boy);

    }

    public static GenderEnum valueOf(String name){
        GenderEnum[] genders = GenderEnum.values();
        Set<GenderEnum> all = EnumSet.allOf(GenderEnum.class);
        for(GenderEnum gender : genders){
            if(gender.name().equals(name)){
                return gender;
            }
        }
        return null;
    }
}
