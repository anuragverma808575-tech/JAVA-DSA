package Loops;

public class AbsoluteDifference {
    public static void main(String[] args) {
        int x=20;
        int y=12;
        int sub=Math.abs(x-y);
        if(sub>=10){
            System.out.println("Larger Difference");  // (x-y)>=10
        }
        else{
            System.out.println("Smaller Differnce"); // (x-y)<10
        }
    }
}
