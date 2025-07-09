import java.util.Scanner;
public class Alphabhet
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         char a1=obj.next().charAt(0);
        if(a1>='a'&& a1<='z'|| a1>='A' && a1<='Z' )
        {
            System.out.print("Alphabet");
        }
        else if(a1>=0 && a1<='9')
        {
            System.out.print("Number");
        }
        else 
        {
            System.out.print("Special  Character");
        }
    }
}