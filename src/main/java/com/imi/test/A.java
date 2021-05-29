/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

/**
 *
 * @author suneelkumar.a
 */
public interface A {
    default void test(){
        System.out.println("test a");
    }
}
