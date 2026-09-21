import java.util.Scanner;
public class UserAge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age = scan.nextInt();
        System.out.println("Your age is:"+age);
    }
}