package Hashing;

import java.util.Scanner;

public class CountADigit {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number limit: ");
        int lim =  sc.nextInt();

        int limArr[] = new int[lim];
        for(int i=0;i<n;i++){
            limArr[arr[i]]++;
        }



        System.out.println("Enter the number of digits to check: ");
        int ndig =  sc.nextInt();
        while(ndig!=0){
            int dig = sc.nextInt();
            System.out.println(dig+ " appeared "+limArr[dig]+" times!!");
            ndig--;

        }
    }
}
