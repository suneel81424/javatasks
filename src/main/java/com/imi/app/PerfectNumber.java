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
public class PerfectNumber {
//like 6=1+2+3(factor sum)
//ex 6,28

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for get perfect numbers");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }

    }
}
