//Q4.Write a program to print the multiplication table of the number entered by the user, N.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i= 1;
        while(i<=10){
            System.out.println(N+" * "+i+" = "+N*i);
            i++;
        }
    }
}
