//Take an integer N as input, print the corresponding Numeric Inverted Half Pyramid pattern for N.
/* 
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
