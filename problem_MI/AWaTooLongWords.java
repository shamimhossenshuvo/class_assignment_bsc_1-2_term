import java.util.Arrays;
import java.util.Scanner;

public class AWaTooLongWords {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        //System.out.println("Enter a number");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){

           //System.out.println("Enter a line");
            String line = input.next();

            char[] charArray = line.toCharArray();
            int charlnth = charArray.length;
            String str = String.valueOf(charArray);

            if (charlnth <= 10) {
                System.out.println(str);
            } else {
                char fst = charArray[0];
                char last = charArray[charlnth - 1];
                int num = charlnth - 2;

                System.out.println(fst + "" + num + "" + last);
            }
        }
    }
}
