package com.infosys.utils;

public class MyUtils {

    public static boolean isNumber(String str){
        if(isEmpty(str)){
            return false;
        }
         String reg = "\\d+(\\d+)?";
         return !str.matches(reg);
    }

    public static boolean isEmpty(String str){

        if (null==str || 0==str.trim().length()) {
            return true;
        }
        return false;
    }
}
