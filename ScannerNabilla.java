
package scannernabilla;
import java.util.Scanner;

public class ScannerNabilla 
{


    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Your Name : ");
        String name = input.nextLine();
        
        System.out.println("My Name Is : " + name);
        
        
        System.out.println("Please Enter Your Favorite Colour : ");
        String colour = input.nextLine();
        
        System.out.println("My Favorite Colour Is : " + colour);
        
        
        System.out.println("Please Enter Your Favorite Number : ");
        int number = input.nextInt();
        
        System.out.println("My Favorite Number Is : " + number);
    }
    
}
