/*
Checks if entire String matches regex pattern
*/


public class matches {
 public static void main(String[] args) {

  String s = "abc123";
   System.out.println(s.matches("[a-z]+\\d+"));
 }

}

//Output:True