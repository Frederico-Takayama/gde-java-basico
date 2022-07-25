package br.com.venturus.arrays;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] arr1;
        int arr2[];

        arr1 = new int[10];
		System.out.println(arr1.length);
		System.out.println(arr1[0]); // get value from pos 0
        arr1[0] = 1; // set value from pos 0
        System.out.println("arr1[0]: " + arr1[0]); // get value from pos 0

        arr2 = arr1;
        arr2[0] = 2; // set value from pos 0
        System.out.println("arr2[0]: " + arr2[0]); // get value from pos 0
        System.out.println("arr1[0]: " + arr1[0]); // get value from pos 0
        System.out.println();


        double[] arr3 = new double[10];
		System.out.println("arr3[0]: " + arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println("arr4[0]: " + arr4[0]);

//		System.out.println(arr4[10]); // gives runtime error

        int[] arr5 = {3, 2, 1};
        System.out.println("arr5[1]: " + arr5[1]);
        System.out.println("arr5: " + arr5);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
		System.out.println("matrix[0][2]: " + matrix[0][2]);

        int[][] matrix2 = new int[10][10];
		System.out.println("matrix2[0]: " + matrix2[0]);

//        System.out.println(java.util.Arrays.toString(arr5));
//        Arrays.sort(arr5);
//        System.out.println(Arrays.toString(arr5));
    }
}
