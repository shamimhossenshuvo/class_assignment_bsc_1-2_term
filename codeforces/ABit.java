import java.util.Scanner;

public class ABit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int n = input.nextInt();

        while (n-- > 0) {
            String x = input.next();
            if (x.contains("++")) {
                a++;
            } else {
                a--;
            }
        }
        System.out.println(a);
    }
}