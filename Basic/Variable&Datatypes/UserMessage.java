import java.util.Scanner;
public class UserMessage{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your meeesage:");
        String message = scan.nextLine();
        System.out.println("Your Message is:"+message);
    }
}