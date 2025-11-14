package reccursion;

public class CountEvenOdd {
    static void CountEvenOdd(int range,int evencount,int oddcount){
        if(range==0){
            System.out.println("Evencount: "+evencount+"\n"+"Oddcount: "+oddcount);
            return;
        }
        if(range%2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
        CountEvenOdd(range-1, evencount, oddcount);

    }
    public static void main(String[] args) {
        CountEvenOdd(100, 0, 0);
    }
}
