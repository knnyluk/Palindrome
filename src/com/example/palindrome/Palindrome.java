package com.example.palindrome;

import java.util.Scanner;
public class Palindrome {
//    public static boolean isPalindrome(String str) {
//        str = str.trim().toLowerCase();
//        int frontIndex = 0;
//        int backIndex = str.length() - 1;
//
//        while ((backIndex - frontIndex) >= 1) {
//            if (str.charAt(frontIndex) != str.charAt(backIndex)) {
//                return false;
//            }
//            frontIndex++;
//            backIndex--;
//        }
//        return true;
//    }

    public static boolean isPalindrome(String inputStr) {
        String reversedStr = new StringBuilder(inputStr).reverse().toString();
        return (inputStr.trim().equals(reversedStr));
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nGive me a word and I shall tell you whether is palindromes or not.");
        String userString = userInput.nextLine().trim();
        if (isPalindrome(userString)) {
            System.out.println("\n\"" + userString + "\" is a palindrome.");
        } else {
            System.out.println("\n\"" + userString + "\" is not a palindrome.");
        }

    }
}
