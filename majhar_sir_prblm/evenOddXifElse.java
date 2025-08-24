import java.util.*;
import java.util.Scanner;
public class evenOddXifElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println("The Number is " + result);
    }

}
