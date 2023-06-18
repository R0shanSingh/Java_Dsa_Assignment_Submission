//Q8.Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.The Pattern should look like:*<N-2 Spaces>*Print the above pattern for a total of N Rows.Refer Example ouput, for better clarification.
/*
*__*
*__*
*__*
*__*
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(j==1||j==N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}