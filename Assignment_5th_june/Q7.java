//Q7.Take an integer N as input, print the corresponding pattern for N.For example if N = 4 then pattern will be like:11 21 2 31 2 3 4NOTE: There should be no extra spaces after last integer.
/*
1
1 2
1 2 3
1 2 3 4
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
