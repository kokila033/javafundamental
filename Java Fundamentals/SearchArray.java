public class SearchArray
 {
    public static void main(String[] args)
     {
        int[] arr = {1, 4, 34, 56, 7};
        int a = 90; 
        int b = -1;

        for (int i = 0; i < arr.length; i++)
         {
            if (arr[i] == a) 
            {
                b = i;
                break;
            }
        }

        System.out.println(b);
    }
}
