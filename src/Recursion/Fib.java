package Recursion;

public class Fib {
    static int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){
        int n = 2;
        System.out.println("Fib of n is: "+fib(n));
    }
}
