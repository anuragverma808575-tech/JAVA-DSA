package reccursion;

public class problem {
    static void fact(int n,int result){
        if(n==1){
            System.out.println(result);
            return;
        }
        // small problem
      fact(n-1, result*n);
      
      //fact(1,120) >> base case
      //fact(2,60)
      //fact(3,20)
      //fact(4,5)
      //fact(5,1)
    }
    public static void main(String[] args) {
        fact(5,1);
    }
}
