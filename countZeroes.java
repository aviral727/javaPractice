import java.util.*;

public class countZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println(countzeroes(n));
    }

    static int zero = 0;

    public static int countzeroes(int n) {
        if (n == 0) {
            return zero;
        }

        if ((n % 10) == 0) {
            zero++;
        }
        countzeroes(n / 10);
        return zero;

    }

}
