package lec1.lec1;

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j % 2) == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}