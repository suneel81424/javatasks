/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.sorting;

/**
 *
 * @author suneelkumar.a
 */
public class App {

    public static void main(String[] args) {
       A a=null;
        System.out.println(a==new A());
    }

    static class A implements C {

//        @Override
//        public void test() {
//            System.out.println("A");
//        }

        public A() {
            System.out.println("A Cons");
        }

    }

    static interface B  {

        static public void test() {
            System.out.println("B");
        }

    }

    static interface C extends B{

        default public void test() {
            System.out.println("C");
        }

    }

}
