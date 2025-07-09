public class positive {
    public static void main(String[] args) {
        char ch1 = 's';
        char ch2 = 'e';

        System.out.println(displayInOrder(ch1, ch2));

        ch1 = 'a';
        ch2 = 'e';

        System.out.println(displayInOrder(ch1, ch2));
    }

    public static String displayInOrder(char c1, char c2) {
        if (c1 < c2) {
            return c1 + "," + c2;
        } else {
            return c2 + "," + c1;
        }
    }
}
