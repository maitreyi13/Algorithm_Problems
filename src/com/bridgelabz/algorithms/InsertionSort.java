package com.bridgelabz.algorithms;

public class InsertionSort {

    public void sort(String[] arr) {
            for (int i = 1; i < arr.length; ++i) {
                String key = arr[i];
                int j = i - 1;

                while (j >= 0 && key.length() < arr[j].length()) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
            InsertionSort ob = new InsertionSort();
            String[] arr ={"Coding","Java","Sort","BST"};
            System.out.println("Before:");
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            int n = arr .length;
            System.out.println("\nAfter: ");
            ob.sort(arr);
        }
    }
