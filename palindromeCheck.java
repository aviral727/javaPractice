import java.util.*;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scan.nextInt();
        // int sum = 0;
        if (reverse(n) == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    static int sum = 0;

    public static int reverse(int n) {
        if (n == 0) {
            return 0;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        reverse(n / 10);
        return sum;

    }
}
