package Loops;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int gcf=1;
        for(int i=1;i<=a;i++){
          if(a%i==0){
           if(b%i==0){
            gcf=i;
           }
          }
          
        }
       
        System.out.println("GCF is:"+gcf);
    }
}
