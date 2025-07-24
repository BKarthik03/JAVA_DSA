package Hashing;

import java.util.Scanner;

public class CountAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String ");
        s = sc.nextLine();
        s=s.toLowerCase();


        int hashArray[] = new int[26];
        for(int i=0;i<s.length();i++){
            hashArray[s.charAt(i)-'a']++;
        }

        System.out.println("Enter the number of characters to check in the array: ");
        int nChar =  sc.nextInt();
        while(nChar!=0){
            int c = sc.next().toLowerCase().charAt(0);
            System.out.println((char)c+" appears "+hashArray[c-'a']+" times in array!!");
        }

    }
}
