import java.util.*;
import java.util.Scanner;

public class ArrayContainsSpecifikValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Enter your finding int");
        int b = input.nextInt();
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (b == a[i]) {
                c = a[i];

            }
        }
       if (c == 0) {
           System.out.println("Number Not Found");
       } else {
           System.out.println("Your Contains Number is: " + c);
       }

    }
}
