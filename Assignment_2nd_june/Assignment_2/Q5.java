//Q5.Write a program to print the multiplication table of the number entered by the user, N.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int i = 1;
        int ans=1;
        while(i<=B){
            ans=ans*A;
            i++;
        }
        System.out.println(ans);
    }
}
