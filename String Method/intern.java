/*
Returns a reference from the string pool if exits
*/


public class intern {
 public static void main(String[] args) {

  String s = new String("java").intern();
   System.out.println(s);
 }

}

//Output:java