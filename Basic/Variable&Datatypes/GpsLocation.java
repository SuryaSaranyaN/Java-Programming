import java.util.Scanner;
public class GpsLocation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double latitude, longitude;
        System.out.print("Please enter the latitude:");
        latitude = scan.nextDouble();
        System.out.print("Please enter the longitude:");
        longitude = scan.nextDouble();
        System.out.println("Your location is: Latitude = " + latitude + ", Longitude = " + longitude);
    }
}