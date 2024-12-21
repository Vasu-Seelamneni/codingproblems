package codeproblems;

import java.util.Scanner;

public class Palindrome {

    private static boolean isPalindrome(String s) {
        String temp = "";
        for(int i=s.length(); i>0; i--) {
            temp = temp + s.charAt(i-1);
        }
        return temp.equals(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Is " + s + " a palindrome? " + isPalindrome(s));
    }

}
