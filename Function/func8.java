public class func8 {
    public static void binToDec(int n){
        int pow=0;
        int deci =0;
        while (binNum>0){
            int lastDigit = binNum%10;
            deci=deci+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        } 
        System.out.println("decimal of " + binNum + " = "+ deci);
    }
}


    public static void main(String[] args) {
        binToDec(111);        
    }
