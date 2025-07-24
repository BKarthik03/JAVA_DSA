package Hashing;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();

        int c[] = new int[256];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }

        System.out.println("Enter the number of characters to check: ");
        int n = sc.nextInt();
        while(n!=0){
            char c1 = sc.next().charAt(0);
            System.out.println(c1+" is present "+c[c1]+" times in array!!");
        }
    }
}
