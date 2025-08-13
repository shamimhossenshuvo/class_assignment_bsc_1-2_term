public class FindIndexOfElement {
    public static void main(String[] args){
        int a[] = {10, 45, 20, 78, 91};

        int b = 91;
        int n = a.length;

        for (int i = 0; i < n; i++){
            if (a[i] == b){
                System.out.println("The index is: " + i);
                break;
            }
        }
    }
}
