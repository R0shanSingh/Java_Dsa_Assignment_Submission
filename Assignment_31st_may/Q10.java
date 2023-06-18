//Q10.Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}
