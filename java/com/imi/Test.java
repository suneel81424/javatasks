/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author suneelkumar.a
 */
public class Test {

    public static void main(String[] args) {
        Pattern compile = Pattern.compile("log_\\d+");
        String s = "s3__301029___13920626934396062.log_.done";
        Matcher matcher = compile.matcher(s);
        if (matcher.find()) {
            String[] group = matcher.group().split("_");
            System.out.println(group);
            
        }
    }


    public void test1() {
        System.out.println("test");
    }

    public static void test() {
        System.out.println("test");
    }
}
