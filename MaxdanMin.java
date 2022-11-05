/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maxdanmin;

/**
 *
 * @author Nitro 5
 */
public class MaxdanMin {

    private static int[] param;

    public static int main(String[] args) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] > value) {
                value = param[i];
            }
        }
        return value;
    }

    public static int getMin(int[] param) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] < value) {
                value = param[i];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {17, 43, 85, 96, 76, 90};

        int max = getMax(arr);
        System.out.println("Bilangan Terbesar Adalah : " + max);

        int min = getMin(arr);
        System.out.println("Bilangan Terkecil Adalah : " + min);
    }
    }

}
