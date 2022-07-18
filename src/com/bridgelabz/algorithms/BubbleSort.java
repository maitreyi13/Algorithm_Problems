package com.bridgelabz.algorithms;

public class BubbleSort {
        public static void BSort(int[] sort_arr, int len){
            for (int i=0;i<len-1;++i){
                for(int j=0;j<len-i-1; ++j){
                    if(sort_arr[j+1]<sort_arr[j]){
                        int swap = sort_arr[j];
                        sort_arr[j] = sort_arr[j+1];
                        sort_arr[j+1] = swap;
                    }
                }
            }
        }
        public static void main( String[] args ) {
            int [] array = {25,10,22,13,8,19,98};
            System.out.println("Before: ");
            int len = array.length;
            for(int i = 0; i<len; ++i){
                System.out.print(array[i] + " ");
            }
            BSort(array,len);
            System.out.println("\nAfter: ");
            for(int i = 0; i<len; ++i){
                System.out.print(array[i] + " ");
            }
        }
    }
