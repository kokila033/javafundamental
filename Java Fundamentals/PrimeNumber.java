public class PrimeNumber
 {
    public static void main(String[] args) 
    {
        for (int num = 11; num < 100; num++) 
        {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) 
            {
                System.out.print(num + " ");
            }
        }
    }
}
