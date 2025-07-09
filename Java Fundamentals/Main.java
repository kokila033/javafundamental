public class Main
 {
    public static void main(String[] args)
     {
        if (args.length != 9) {
            System.out.println(" enter 9 integer numbers");
            return;
        }
        int max = Integer.MIN_VALUE;
        System.out.println("The given array is:");
        for (int i = 0; i < 9; i++) 
        {
            int num = Integer.parseInt(args[i]);
            if (num > max) max = num;
            System.out.print(num + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
