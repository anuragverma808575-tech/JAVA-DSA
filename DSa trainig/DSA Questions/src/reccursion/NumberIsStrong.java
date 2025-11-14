package reccursion;

public class NumberIsStrong {
     static void fact(int n,int result){
        if(n==1){
            return;
        }
        // small problem
      fact(n-1, result*n);
    }
    static void StrongNumber(int n){
        int sum=0;
        if(n==0){
            return;
        }
        int temp=n;
        int digit=n%10;
        int ans +=fact(digit,sum );

    }
    public static void main(String[] args) {
        StrongNumber(145);
    }
}
