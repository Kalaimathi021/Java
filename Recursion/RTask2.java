package Recursion;

import java.util.Scanner;

public class RTask2 {
    static int sum(int n){
        int sum1=0;
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
    }
}
