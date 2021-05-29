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
public class Pattern2 {
    /*1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5*/

    public static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
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
    /*1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5*/

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    /*
     pattern
     * 
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * * 
     * *
     *
    
     */

    public static void pattern3() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 5 && i + j > 10) {
                    break;
                }
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
