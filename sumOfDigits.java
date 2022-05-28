import java.util.*;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scan.nextInt();
        // scan;
        System.out.println(printDigitSum(n));
    }

    public static int printDigitSum(int n) {

        if (n == 0) {
            return 0;
        }

        return ((n % 10) + printDigitSum(n / 10));
    }
}
