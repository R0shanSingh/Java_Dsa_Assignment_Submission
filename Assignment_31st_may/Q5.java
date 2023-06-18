//Q5.Write a program to input an integer from user and print 1 if it is odd otherwise print 0.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
