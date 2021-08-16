package com.company.randomElementRemoval;

import java.util.Random;

public class Main {

    static void removeElement(int[] arr) {
        Random r = new Random();

        while (arr.length > 0) {
            int index = r.nextInt(arr.length);

            System.out.println("Index: " + index + ", Element: " + arr[index]);
            System.out.println("Removed!!");

            int[] arr1 = new int[arr.length - 1];
            for (int i = 0; i < index; i++)
                arr1[i] = arr[i];
            for (int i = index; i < arr.length - 1; i++)
                arr1[i] = arr[i + 1];
            arr = arr1;

        }

        System.out.println("Done. Array is empty");

    }

    public static void main(String[] args) {
	// write your code here

        int[] arr = { 1, 3, 5, 7, 9, 0, 2, 4 };
        removeElement(arr);
    }
}


