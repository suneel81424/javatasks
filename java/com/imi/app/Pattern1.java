/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.app;

/**
 *
 * @author suneelkumar.a
 */
public class Pattern1 {
   /*1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1*/

    public static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern1();
        System.out.println("********************************************");
        pattern2();
        System.out.println("********************************************");
        pattern3();
    }
    /*
     pattern
     * 
     * * 
     * * * 
     * * * * 
     * * * * *
     */

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    /*
     pattern
     * * * * *
     *       * 
     *       * 
     *       * 
     * * * * *
     */

    public static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
