/*
same as compareTo() but ignore case (capital/small)
*/

public class CompareToIgnoreCase {
 public static void main(String[] args) {

   String s1 = "Imperial";
   String s2 = "imperial";
   int result;
   result = s1.compareToIgnoreCase(s2);
   System.out.println(result);
 }

}

//Output: 0