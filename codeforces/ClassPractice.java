//date: 12-7-2025
//Majharul Islam sir
import java.util.Scanner;
import java.util.*;
public class ClassPractice {
    public static void main(String[] args) {
        int B = 0, CNT = 0;

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        while (N != 0) { 
            int rem = N % 2;
            double c = Math.pow(10,CNT);
            B += rem * c;
            N = N / 2;
            CNT++;
            
        }
        System.out.println(B);
    }
}
