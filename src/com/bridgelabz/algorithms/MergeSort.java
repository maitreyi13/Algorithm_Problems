package com.bridgelabz.algorithms;
import java.util.Arrays;

public class MergeSort {
        void merge(int[] array, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int[] L = new int[n1];
            int[] M = new int[n2];

            for (int i = 0; i < n1; i++)
                L[i] = array[l + i];
            for (int j = 0; j < n2; j++)
                M[j] = array[m + 1 + j];
            int i, j, k;
            i = 0;
            j = 0;
            k = l;


            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = M[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                array[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                array[k] = M[j];
                j++;
                k++;
            }
        }
        // Divide the array into two sub arrays, sort them and merge them
        void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);

                merge(array, left, mid, right);
            }
        }

        public static void main(String[] args) {
            int[] array = { 7, 10, 11, 4, 6, 77, 99, 9, 1 };
            System.out.println("Before: ");
            System.out.println(Arrays.toString(array));
            MergeSort ob = new MergeSort();
            ob.mergeSort(array, 0, array.length - 1);
            System.out.println("\nAfter: ");
            System.out.println(Arrays.toString(array));
        }
    }
