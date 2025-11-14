package Switchcase;

public class ch1 {
    public static void main(String args[]){
        // For MenuDriven
        System.out.println("1: Pizza");
        System.out.println("2: Burger");
        System.out.println("3: Drinks");
        System.out.println("4: Desserts");

        String choice="Burger";
        double price=switch(choice){
            case:"Burger"->100;
            case:"Pizza"->1000;
        }
        // int choice=1;
        // switch(choice){
        //     case 1:
        //     System.out.println("Rs.100");
        //       case 2:
        //     System.out.println("Rs.200");
        //       case 3:
        //     System.out.println("Rs.50");
        //       case 4:
        //     System.out.println("Rs.200");
        //       default:
        //       System.out.println("Invalid choice.....");

        // }
    }
}
