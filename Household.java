import java.util.*;
 public class Household{
   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of family members:");
        int members = sc.nextInt();
        System.out.println("Enter water consumed in litres:");
        double waterConsumed = sc.nextDouble();
        System.out.println("Enter house number:");
        int houseNumber = sc.nextInt();
        System.out.println("Enter water usage status:");
        String status = sc.next();
        System.out.println("The number of family members:"+ members);
        System.out.println("Water consumed:"+ waterConsumed);
        System.out.println("House number:"+ houseNumber);
        System.out.println("Water usage status:"+ status);
        sc.close();
         
    }
}
