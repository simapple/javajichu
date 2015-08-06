package com.simapple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {

    public static void main(String[] args) {
	    // write your code here
        String url = "list-5536-1.html";
        Hello hello = new Hello();

        //静态方法不得调用使用非静态变量

        String catid = hello.getCatidByURL(url);
        if(catid != ""){
            System.out.println("catid ==" + catid);

        }
        System.out.println("hello java");
    }

    public    String  getCatidByURL(String url){
        String p = "list-(\\d+)-";
        Pattern r = Pattern.compile(p);

        Matcher m = r.matcher(url);
        if(m.find()){
            return m.group(1);
        }else{
            return "";
        }

    }
}
