import java.util.*;

public class stepsToZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println(stepCounter(n, 0));
    }

    // static int steps = 0;

    public static int stepCounter(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        if ((n % 2) == 0) {
            return stepCounter(n / 2, steps + 1);
        } else {
            return stepCounter(n - 1, steps + 1);
        }
        // return steps;
    }
}
