package ApnaCollege.lec2.Arrays;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the Number you need to find in an Array: ");
        int number = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter the Elements into an Array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Elements stored inside an Array are: ");
        for (int j = 0; j < size; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        for (int k = 0; k < size; k++) {
            if (numbers[k] == number) {
                System.out.print("The index of the element " + number + " is: " + k);
            }
        }
        System.out.println();
    }
}
