package com.bridgelabz.algorithms;
import java.util.Scanner;
import java.util.Arrays;

    public class AnagramString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two words to check for anagram: ");
            String str1 = sc.next();      //mane
            String str2 = sc.next();     //name

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if(str1.length() == str2.length()) {
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean result = Arrays.equals(charArray1, charArray2);
                if(result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    }
