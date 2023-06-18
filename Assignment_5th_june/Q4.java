//Q4.Take an integer N as input, print the corresponding pattern for N.
/*
1
1_
1_3
1_3_
1_3_5 

('_')-> denotes space.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
