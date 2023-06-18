//Q2.You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i =1;i<=N;i++){
            int num=i;
            int rem=0;
            int sum=0;
            while(num>0){
                rem=num%10;
                sum=sum+(int)Math.pow(rem,3);
                num=num/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
