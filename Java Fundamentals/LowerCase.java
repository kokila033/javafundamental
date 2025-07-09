import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args)
     {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = obj.next().charAt(0);

        if (Character.isLowerCase(ch)) 
        {
            System.out.println( Character.toUpperCase(ch));
        } 
        else if (Character.isUpperCase(ch)) 
        {
            System.out.println( Character.toLowerCase(ch));
        } 
        else
        {
            System.out.println("Not an alphabet character.");
        }

        obj.close();
    }
}
