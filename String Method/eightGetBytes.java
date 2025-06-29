/*
Convert a string to byte formate (used for I/O or Network transmission)
*/

import java.util.Arrays;

public class eightGetBytes {
 public static void main(String[] args) {

    String s = "ICE";
    byte[] arr = s.getBytes();
    System.out.println(Arrays.toString(arr));
 }

}

//Output: [73, 67, 69]