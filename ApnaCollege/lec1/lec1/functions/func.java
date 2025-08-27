package lec1.lec1.functions;

import java.util.*;

public class func {
    // public static String printMyName(String Name) {
    //     // System.out.println(Name);
    //     return Name;
    // }

    public static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String name = sc.nextLine();
        // String nameReturned = printMyName(name);
        // System.out.println("Hello " +  nameReturned);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = sumOfTwoNumber(num1, num2);

        System.out.println(res);
    }
}
