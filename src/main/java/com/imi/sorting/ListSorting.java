/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author suneelkumar.a
 */
public class ListSorting {

    public static void main(String[] args) {
        String str = new String("suneel");
        String str2 = "suneel";
        System.out.println(str.toUpperCase().intern()== str2.toUpperCase());
        System.out.println(str.intern() == str2);
        Stream s = Stream.of(1, 2, 3, 4, 5);
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        Collections.reverse(list);
//        System.out.println(list);
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(list.stream().min(Math::min).get());

    }
}
