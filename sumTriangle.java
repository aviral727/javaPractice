import java.util.*;
import java.lang.*;

public class sumTriangle {
    public static void main(String[] args) {
        System.out.println("enter 5 elements of array");
        Scanner scan = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        printTriangle(arr);
    }

    public static void printTriangle(int[] a) {
        if (a.length < 1) {
            return;
        }

        int[] temp = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            int x = a[i] + a[i + 1];
            temp[i] = x;
        }

        printTriangle(temp);

        System.out.println(Arrays.toString(a));

    }
}
