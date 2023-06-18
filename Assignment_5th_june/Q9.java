//Q9.Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.
/*

*****
*__*
*_*
**
*

*/

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i==1||i==N){
                for(int j=1;j<=N-i+1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=N-i+1;j++){
                    if(j==1||j==N-i+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
