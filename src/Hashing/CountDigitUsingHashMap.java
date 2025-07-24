package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountDigitUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        HashMap<Integer, Integer> hash= new HashMap<Integer, Integer>();

        System.out.println("Enter the array size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int frequency = hash.getOrDefault(arr[i],0);
            hash.put(arr[i],frequency+1);
        }

        System.out.println("Enter the digits to check: ");
        int sDig = sc.nextInt();
        while(sDig!=0){
            int cDig = sc.nextInt();
            System.out.println(cDig+" appears "+hash.getOrDefault(cDig,0)+" times in array!!");
            sDig--;
        }
    }
}
