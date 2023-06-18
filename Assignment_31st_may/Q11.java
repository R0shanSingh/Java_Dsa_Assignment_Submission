//You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.]

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int type= sc.nextInt();
        int amount=sc.nextInt();

        if (type==1){
            N+=amount;
            System.out.println(N);
        }
        else if(type==2){
            N-=amount;
            if(N<0){
                System.out.println("Insufficient Funds");
            }
            else{
                System.out.println(N);
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
