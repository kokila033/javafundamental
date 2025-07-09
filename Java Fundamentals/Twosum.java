import java.util.Scanner;
public class Twosum{
    public static void main (String[]args){
    
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        System.out.println("enter the number");
        if(n>0)
        {
            System.out.println("Enter the positive number");
        }
        else if(n<0){
            System.out.println("Enter the negative number");

        }
        else{
            System.out.println("Enter the zero number");
        }
        obj.close();
    }
}