import java.util.*;

public class nTo1Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println(findFact(n));

    }

    public static int findFact(int x) {
        if (x <= 1) {
            return 1;

        }
        return x * findFact(x - 1);

    }

}
