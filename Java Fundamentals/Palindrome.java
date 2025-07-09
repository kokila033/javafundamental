import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        int n = new Scanner(System.in).nextInt();
        int temp = n, rev = 0;
        while (n > 0)
         {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not a Palindrome");
    }
}
