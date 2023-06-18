//Q3.Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.

import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}