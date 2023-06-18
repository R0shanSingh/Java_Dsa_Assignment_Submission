//Q8.You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if(angle1+angle2+angle3==180 && angle1>0 && angle2>0 && angle3>0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
