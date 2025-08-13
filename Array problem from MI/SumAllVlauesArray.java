import java.util.*;
import java.util.Scanner;

public class SumAllVlauesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[7];
        int n = a.length;
        System.out.println("Enter your array numbers: ");
        int sum = 0; //a[i] + a[i+1];
        for(int i = 0; i < n ; i++) {
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
        System.out.println("List of array Numbers " + Arrays.toString(a));
        System.out.println(sum);
    }

}
