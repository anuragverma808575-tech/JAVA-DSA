package reccursion;

public class PrintTable {
    // static void PrintTable(int num, int range) {
    //     if (range == 0) {
    //         return;
    //     }
    //     PrintTable(num, range - 1);
    //     System.out.println(num + "X" + range + "=" + num * range);
    // }

     static void PrintTable(int num, int range,String result) {
        if (range == 0) {
            System.out.println(result);
            return;
        }
        
        String expression=num + "X" + range + "=" + num * range;
        PrintTable(num, range - 1, expression + "\n" + result);

    }

    public static void main(String[] args) {
       // PrintTable(5, 10);
       PrintTable(5, 10, "");
    }
}

// String to Integer conversion without using parseint with help of ASCIIva vlue