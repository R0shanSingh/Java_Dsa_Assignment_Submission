//Q4.Implement a program that takes two positive integers A and B in the input and prints their LCM.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int hcf=0;
        for(int i=1;(i<=A && i<=B);i++){
            if(A%i==0 && B%i==0){
                hcf=i;
            }
        }
        int lcm = (A*B)/hcf;
        System.out.println(lcm);
    }
}
