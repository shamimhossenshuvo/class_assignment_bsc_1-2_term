import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int num = input.nextInt();
        System.out.println("Please Enter a Second Number: ");
        int num2 = input.nextInt();
        System.out.println("What do your operation: ");
        char operation = input.next().charAt(0);

        System.out.println(num);
        System.out.println(num2);
        System.out.println(operation);

        if (operation == '-') {
            int sub = num - num2;
            System.out.println(sub);
        } else if (operation == '+') {
            int add = num + num2;
            System.out.println(add);
        } else if (operation == '*') {
            int mul = num * num2;
            System.out.println(mul);
        } else {
        float div = num / num2;
        System.out.println(div);
        input.close();
    }
}
    }
