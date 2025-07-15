import java.util.Scanner;

class LearnScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter an Integer");

        int a = input.nextInt();
        
        System.out.println(a);

    }
}


/*import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
*/