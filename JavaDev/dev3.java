import java.util.Scanner;

public class dev3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d=0;
        while (n!=0){
            n=n/10;
            d++;
        }
        System.out.println(d);
    }
    
}
