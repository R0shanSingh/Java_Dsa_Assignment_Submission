/* Given two integers N and M as inputs, print a rectangle of N * M stars.

****
****
****

 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=M;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
