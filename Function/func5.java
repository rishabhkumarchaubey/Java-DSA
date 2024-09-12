public class func5 {
    public static int factorial(int n){
        int fact =1;
        for (int i=1;i<=n;i++)
        fact= fact*i;
        return fact;
    }

    public static int bincoe(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoe = fact_n/(fact_r*fact_nmr);
        return bincoe;
        
    }
    public static void main(String[] args) {
        int a= bincoe(5, 2);
        System.out.println(a);



        
    }
    
}
