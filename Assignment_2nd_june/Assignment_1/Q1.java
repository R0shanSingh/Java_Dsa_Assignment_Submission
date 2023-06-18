/*Q1.Take an integer A as input, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.*/

import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count=0;
        for (int i = 1;i<=A;i++){
            if(A%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}