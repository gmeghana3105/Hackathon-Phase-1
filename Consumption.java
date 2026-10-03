import java.util.Scanner;
public class Consumption{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water consumed in litres:");
        double waterConsumed = sc.nextDouble();
        if(waterConsumed<=500){
            System.out.println("Water bill is Rs 100");
        }
        else{
            System.out.println("Water bill is Rs 200");
        }
        sc.close();
    }
} 