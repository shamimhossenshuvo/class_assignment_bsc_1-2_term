/*
only the first thing thar matches the regex is changed
*/

public class sixReplaceFirst{
    public static void main(String[] args) {
          String s = "123-456-789";
          System.out.println(s.replaceFirst("\\d+","***"));
    }
}

//output: ***-456-789
