//Q11.Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.
/*
*
**
***
****
*****
****
***
**
*
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=N-1;i++){
            for(int j=N-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
