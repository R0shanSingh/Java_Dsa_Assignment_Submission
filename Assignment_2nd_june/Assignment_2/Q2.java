//Q2.Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =0;
        while(i<=N){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
