//Write a program to print all Natural numbers from 1 to N where you have to take N as input from user

import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        while(i<=N){
            System.out.print(i+" ");
            i++;
        }
    }
}