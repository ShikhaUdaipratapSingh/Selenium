package com.matrix.shikha.corejava.array;

public class TestArray {

    public static void main(String[] args) {
        int [] marks = {10, 20, 30};

        int [] arr = new int[4];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;

        //System.out.println(arr[0]);

        for (int a : marks) {
            //System.out.println(a);
        }

        for (int i = 0; i<=2; i++) {
            System.out.println(marks[i]);
        }
    }
}
