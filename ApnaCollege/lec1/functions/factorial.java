package ApnaCollege.lec1.functions;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        // int facto = 1;
        // while (n != 0) {
        // facto = facto * n;
        // n--;
        // }
        if (n != 0 || n != 1) {
            return 1 * fact(n - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
