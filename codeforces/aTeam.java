import java.util.Scanner;


public class aTeam {
    public static void main(String[] args) {
        int a,b,c,ans=0,n;
        Scanner input = new Scanner(System.in);
          n = input.nextInt();


        for (int i = 1; i  <= n; i++) {
              a = input.nextInt();
              b = input.nextInt();
              c = input.nextInt();

          if (a+b+c >= 2) {
              ans++;

          } else {

          }

        }
         System.out.println(ans);
    }
}
