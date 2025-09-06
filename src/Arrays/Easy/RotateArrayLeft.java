package Arrays.Easy;

import java.util.Scanner;

public class RotateArrayLeft {
    static void rotateArray(int a[]){
        int temp = a[0];
        for(int i=1;i<a.length;i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }

    static void leftBrute(int a[],int k){
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = a[i];
        }

        for(int i=k;i<a.length;i++){
            a[i-k] = a[i];
        }

        for(int i=(a.length)-k;i<a.length;i++){
            a[i] = temp[i-(a.length-k)];
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        System.out.println("Enter number of rotations: ");
        int k = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        for(int i=1;i<=11;i++)
//            rotateArray(arr);
        leftBrute(arr,k);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
