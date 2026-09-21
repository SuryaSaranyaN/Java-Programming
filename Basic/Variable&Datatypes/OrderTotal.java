import java.util.Scanner;
public class OrderTotal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the price of the item:");
        double price = scan.nextDouble();    
        System.out.println("Total cost:"+price);
    }
}