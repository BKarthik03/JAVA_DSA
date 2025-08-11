package Arrays.Easy;

import java.util.Scanner;

public class CheckIfSorted {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) {
                System.out.println("Array is not in Ascending order!!");
                return;
            }
        }
        System.out.println("Array is in Ascending order!!");
    }
}
