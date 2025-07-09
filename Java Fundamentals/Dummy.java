import java.util.Scanner;
public class Dummy
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashset<>();

        for (int num : arr) 
        {
            set.add(num);
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
