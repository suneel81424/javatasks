/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author suneelkumar.a
 */
public class MapTest {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(intList.stream().mapToInt(Integer::intValue).sum());
        Set<String> strngLst = intList.stream().map(i -> i + "").collect(Collectors.toSet());
        System.out.println(strngLst);
        System.out.println(strngLst.stream().mapToInt(Integer::parseInt).sum());
        System.out.println(intList.stream().reduce(1, (a, b) -> a * b));
        System.out.println(intList.stream().reduce(0, Integer::sum));
    }

}
