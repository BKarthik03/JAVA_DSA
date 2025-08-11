package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j])
                arr[++j] = arr[i];
        }

        System.out.println("Unique Elements in array are: "+ (j+1));
        for(int i=0;i<=j;i++)
            System.out.print(arr[i]+" ");
    }
}
