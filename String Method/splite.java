/*
breaks string into parts (array) using regex/delimiter
*/

import java.util.Arrays;

public class splite {
 public static void main(String[] args) {

   String s = "A,B,C";
   String[] arr = s.split(",");
   System.out.println(Arrays.toString(arr));
 }

}

//Output: [A, B, C]