import java.util.Scanner;

public class dev1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int d = low; d<=high; d++){
            int count = 0;

            for (int div= 2; div*div<=d;div++ ){
                if (d%div==0){
                    count++;
                    break;
                }
            }
            if (count ==0){
                System.out.println(d);
            }
        }
        
    }
    
}
