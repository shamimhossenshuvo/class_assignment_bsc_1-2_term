//date: 12-7-2025
//Majharul Islam sir

public class class_practice {
    public static void main(String[] args) {
        int N = 10, B = 0, CNT = 0;

        while (N != 0) { 
            int rem = N % 2;
            double c = Math.pow(10,CNT);
            B += rem * c;
            N = N / 2;
            CNT++;
            
        }
        System.out.println(B);
    }
}
