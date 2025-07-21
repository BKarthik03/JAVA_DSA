package Recursion;

import java.util.Scanner;

public class StringPalindrome {

    static boolean isStringPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("String is Palindrome? -> "+isStringPalindrome(s));
    }
}
