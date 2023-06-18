//Q5.Take an integer N as input and print the count of its factors.The factor of a number is the number that divides it perfectly leaving no remainder.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=1;
        for(int i=1;i<=N/2;i++){
            if(N%i==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
