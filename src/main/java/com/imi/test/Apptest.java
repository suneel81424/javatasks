/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author suneelkumar.a
 */
public class Apptest {
    
    public static void main(String[] args) throws InterruptedException {
        String data = "10,30,60";//retry 3
        String timeUnit = "SECONDS";
        int counter = 0;
        Map<Integer, Long> contactPolicyRetrySeconds = new HashMap();
        for (String s : data.split(",")) {
            contactPolicyRetrySeconds.put(++counter, TimeUnit.MILLISECONDS.convert(Long.parseLong(s), TimeUnit.valueOf(timeUnit)));
        }
        System.out.println(contactPolicyRetrySeconds);
        System.out.println(counter > 3);
        boolean retyrfalg;
        do {
            int retrycount = 1;
            retyrfalg = false;
            try {
                
            } catch (Exception e) {
                if (retrycount <= counter) {
                    long time = contactPolicyRetrySeconds.get(retrycount);
                    retrycount++;
                    retyrfalg = true;
                    Thread.sleep(time);
                }
            }
        } while (retyrfalg);
    }
}
