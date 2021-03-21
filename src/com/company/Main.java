package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int size = 10;

        Numbers num1 = new Numbers();
        int[] array1 = num1.getFilledArray(size, input, (a, b) -> {
            int[] array = new int[a];
            for (int i = 0; i < a; i++) {
                array[i] = b + i;
            }
            return array;
        });
        System.out.println(Arrays.toString(array1));

        Numbers num2 = new Numbers();
        int[] array2 = num2.getFilledArray(size, input, (a, b) -> {
            int[] array = new int[a];
            for (int i = 0; i < a; i++) {
                array[i] = b * i;
            }
            return array;
        });
        System.out.println(Arrays.toString(array2));

        Numbers num3 = new Numbers();
        int[] array3 = num3.getFilledArray(size, input, (a, b) -> {
            int[] array = new int[a];
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    array[i] = i / 2 + b;
                } else {
                    array[i] = i * i - b;
                }
            }
            return array;
        });
        System.out.println(Arrays.toString(array3));

        in.close();
    }
}
