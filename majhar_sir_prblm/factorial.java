import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = 1;
        for (int i = 1; i <= N; i++) {
            A = A * i;
        }
        System.out.println(A);
    }
}
