package reccursion;

public class ConvertintoBinary {
    static void BinarytoDecimal(int n,int dec,int pow){
        if(n==0){
            System.out.println("Decimal number is: "+dec);
            return;
        }
        int digit=n%10;
        dec=dec+digit*(int)Math.pow(2, pow);
        BinarytoDecimal(n/10, dec,pow+1);


    }
    public static void main(String[] args) {
        BinarytoDecimal(101, 0,0);
    }
}
