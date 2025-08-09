import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter your Array: ");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
        int n = a.length;
        for ( int i = 0; i < n-1; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
