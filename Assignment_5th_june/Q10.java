//Take an integer N, print the corresponding Full Pyramid pattern for N.
/*
   *   
  ***
 *****
*******
*/
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j = N-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
