/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.app;

import java.util.Scanner;

/**
 *
 * @author suneelkumar.a
 */
public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for get armstrong numbers");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (isArmStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmStrongNumber(int number) {
        if (number == 0 || number == 1) {
            return true;
        } else {
            int temp = number;
            int rev = 0;
            int r = 0;
            while (temp > 0) {
                r = temp % 10;
                temp = temp / 10;
                rev += r * r * r;
            }
            return rev == number;
        }

    }
}
