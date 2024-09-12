public class func4 {
    public static int factorial(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact = i*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        int b = factorial(5);
        System.out.println(b);
        
    }
    
}
