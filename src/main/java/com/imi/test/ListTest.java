/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author suneelkumar.a
 */
public class ListTest {

    static class Bean {

        public List<String> list;

        public List<String> getList() {
            return list;
        }

    }

    public static void main(String[] args) {
        ListTest.Bean b = new Bean();
        b.list = new ArrayList<>(Arrays.asList("1,2,4".split(",")));
        doSomeTask(b.getList());
        ListIterator<String> li = b.getList().listIterator();
        while (li.hasNext()) {
            String key = li.next();
            if (key.equalsIgnoreCase("1")) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
            if (key.equalsIgnoreCase("2")) {
                li.remove();
            }
        }
        System.out.println(b.list);
    }

    public static void doSomeTask(List<String> ls) {
        try {
            Thread.sleep(1000);
            ls=null;
            System.out.println(ls);
        } catch (Exception e) {
        }
    }
}
