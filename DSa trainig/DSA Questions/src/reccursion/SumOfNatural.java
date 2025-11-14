package reccursion;

public class SumOfNatural {
    static void sum(int n,int sum){
        if(n==0){
            System.out.println("Sum of numbers is: "+sum);
            return;
        }
        sum+=n;
        sum(n-1, sum);
    }

    public static void main(String[] args) {
        sum(10, 0);
    }
}
