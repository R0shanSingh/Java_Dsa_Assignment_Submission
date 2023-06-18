/*Q3.You are given an integer A as input and you need to determine whether it is a palindrome or not.A palindrome integer is
 one whose digits,when reversed, result in the same number.For example, 121 is a palindrome because its reverse is also 
 121, but 123 is not a palindrome because its reverse is 321.Note: The given integer will not have any leading zeros. */

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int num= A;
    int rem= 0;
    int revA=0;
    while(num>0){
        rem=num%10;
        revA=revA*10+rem;
        num=num/10;
    }
    if(A==revA){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
  }  
}
