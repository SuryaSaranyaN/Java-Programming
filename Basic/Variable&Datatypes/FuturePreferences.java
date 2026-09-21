import java.util.Scanner;
public class FuturePreferences{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean preference;
        System.out.print("Do you prefer the future? (true/false):");
        preference = scan.nextLine();
        System.out.println("Your preference for the future is: " + preference);
    }
}
