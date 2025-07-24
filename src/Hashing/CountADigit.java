package Hashing;

import java.util.Scanner;

public class CountADigit {

    public static void main(String[] args) {
       int n, limit, sDig;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number limit in the array: ");
        limit = sc.nextInt();

        int lim[] = new int[limit];
        for(int i=0;i<n;i++){
            lim[arr[i]]++;
        }

        System.out.println("Enter the digits to check: ");
        sDig = sc.nextInt();
        while(sDig!=0){
            int cDig = sc.nextInt();
            try{
                System.out.println(cDig+" appears "+lim[cDig]+" times in the array!!");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Digit is not present in the array!!");
            }
            sDig--;
        }
    }
}
