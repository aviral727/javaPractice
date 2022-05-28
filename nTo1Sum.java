import java.util.*;

public class nTo1Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        // scan.close();
        print_n(n);
    }

    public static void print_n(int x) {
        if (x == 0) {
            // System.out.println(1);
            return;
        }
        System.out.println(x);
        print_n(x - 1);
        System.out.println(x);

    }
}
