/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author suneelkumar.a
 */
public class App implements A, B {

    public static void main(String[] args) {
        System.out.println("\"pavankumar.g@imimobile.com\",\"gvmpavankumar14@gmail.com\"");
    }

    //only for bcc and cc
    public static List<String> getListFromString(String data) {
        data = data.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\"", "");
        return Arrays.asList(data.split(","));
    }

    public static boolean testing(String data) {
        List<String> list = Arrays.asList("1,2,4".split(","));
        for (int i = 0; i < list.size(); i++) {
            if (data.equalsIgnoreCase(list.get(i))) {
                return true;
            }
        }
        System.out.println("came");
        return false;
    }
}
