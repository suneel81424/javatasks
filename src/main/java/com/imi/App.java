/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author suneelkumar.a
 */
public class App {

    public static void main(String[] args) {
        System.out.println("");
        Pattern keyPattern = Pattern.compile("^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})", Pattern.CASE_INSENSITIVE);
        Matcher matcher = keyPattern.matcher("APSP@LIVE");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static String getMmsMsisdn(String msisdn) {
        if (!msisdn.startsWith("+")) {
            // If destination number starts with 00 then its required to replace 00 with + symbol. If destination number starts with only 0, we will not add + symbol.
            if (!msisdn.startsWith("0") || msisdn.startsWith("00")) {
                if (msisdn.startsWith("00")) {
                    msisdn = msisdn.replaceAll("00", "+");
                } else {
                    msisdn = "+" + msisdn;
                }
            }
        }
        return msisdn;
    }
}
