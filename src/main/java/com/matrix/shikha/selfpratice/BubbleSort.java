package com.matrix.shikha.selfpratice;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSort(arr);// sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                // { 3, 60, 35, 2, 45, 320, 5 }
                if (arr[j-1] > arr[j]) {
                    temp = arr[j - 1]; // 60
                    arr[j - 1] = arr[j]; // 35
                    arr[j] = temp; // 60
                }
            }
        }
    }
}

