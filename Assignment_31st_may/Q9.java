//Q9.Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A<=0 || B<=0 || C<=0 || !validornot(A, B, C)){
            System.out.println("Invalid Triangle");
        }
        else if(A==B && A==C){
            System.out.println("Equilateral");
        }
        else if(B==C || B==A){
            System.out.println("Isoceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
    public static Boolean validornot(int side1,int side2,int side3){
        if(side1>side2 && side1>side3){
            if ((side2+side3)>side1){
                return true;
            }
            return false;
        }
        else if(side2>side3){
            if ((side1+side3)>side2){
                return true;
            }
            return false;
        }
        else{
            if ((side2+side1)>side3){
                return true;
            }
            return false;
        }
    }
}
