import java.util.Scanner;
public class Percentage
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String gender=obj.nextLine();
        int age=obj.nextInt();
        String a="female";
        String b="male";
        if(gender.equals(a) && age>=1 && age<=58)
        {
            System.out.print("8.2%");
        }
        else  if(gender.equals(a) && age>=59 && age<=100)
       {
             System.out.print("9.2%");

       }    
         else  if(gender.equals(b)&& age>=1 && age<=58)
         {
         System.out.print("8.4%");
    
         }
        else  if(gender.equals(b) && age>=59 && age<=100)
        {
           System.out.print("10.5%");
          }
          else
          {
            System.out.print("invalid");
          }
    }
}