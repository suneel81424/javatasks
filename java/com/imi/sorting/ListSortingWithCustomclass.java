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

/**
 *
 * @author suneelkumar.a
 */
public class ListSortingWithCustomclass {
    
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(4, "sai", 25000));
        list.add(new User(3, "puji", 28000));
        list.add(new User(1, "suneel", 23000));
        list.add(new User(2, "dileep", 25000));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
//        Collections.sort(list, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
//        System.out.println(list);
        list.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(o -> o.getSalary())).forEach(System.out::println);
        System.out.println(list);
    }
}
