package com.example.palindrome;

import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int frontIndex = 0;
        int backIndex = str.length() - 1;

        while ((backIndex - frontIndex) >= 1) {
            if (str.charAt(frontIndex) != str.charAt(backIndex)) {
                return false;
            }
            frontIndex++;
            backIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userString = userInput.nextLine();
        if (isPalindrome(userString)) {
            System.out.println("\n\n" + userString + " is a palindrome.");
        } else {
            System.out.println("\n\n" + userString + " is not a palindrome.");
        }

    }
}
