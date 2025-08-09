import java.util.*;
import java.util.Scanner;

public class CalculateAverageArrayElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        int n = a.length;
        System.out.println("Enter Your Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int i = 0;
        int sum = a[i] + a[i+1];
        for ( i = 2; i < n; i++){
            sum = sum + a[i];
        }
        //double fsum = sum;
        double fn = n;
        double avg = sum / fn;
        String br = System.lineSeparator();
        System.out.print("The numbers: " + Arrays.toString(a) + br + "Sum of the all number: " + sum + br + "The avarage number: " + avg);

    }
}
