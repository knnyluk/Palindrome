package com.example.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String str) {
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
        System.out.println(isPalindrome("lolo"));
    }
}
