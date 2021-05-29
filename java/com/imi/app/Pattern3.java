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
public class Pattern3 {
    /*
     * 
     * *
     * * *
     * * * *
     * * * * *
     */

    public static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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
     * * * * *
     * * * *
     * * * 
     * *
     *
     */

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    /*
     pattern
     J A V A
     A V A
     V A
     A
    
     */

    public static void pattern3() {
        String s = "JAVA";
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (i <= j) {
                    System.out.print(s.charAt(j - 1) + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}
