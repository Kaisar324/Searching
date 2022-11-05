/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maximal.java;

/**
 *
 * @author Nitro 5
 */
public class MaximalJava {

    public static void main(String[] args) {
     
          int[] arr = new int[] {44, 23, 55, 76, 21, 100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        System.out.println("Bilangan terbesar dari array adalah : " + max);
    }
}

