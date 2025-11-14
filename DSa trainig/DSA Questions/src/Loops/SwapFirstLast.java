package Loops;

public class SwapFirstLast {
    public static void main(String[] args) {
       int n=34567;
       int digit=0;
       int temp=n;
       while(n>0){
        n=n/10;
        digit++;
       } 
       int pow=(int)Math.pow(10,(digit-1));
       int num=temp;
       int first=num/pow;
       int last=num%10;
       int middle=(num%pow)/10;
       int swapped=last*pow+middle*10+first;
       System.out.println("Actual numbers:"+num);
       System.out.println("Swapped numbers:"+swapped);


    }
}
