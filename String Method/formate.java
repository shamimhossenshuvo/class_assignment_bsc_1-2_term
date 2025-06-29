/*
returns a formatted String using placeholders like (%d, %s, ETC)
*/

public class formate {
 public static void main(String[] args) {

   String result = String.format("Roll: %d, Name: %s", 101, "Ratul");
   System.out.println(result);
 }

}

//Output: Roll: 101, Name: Ratul