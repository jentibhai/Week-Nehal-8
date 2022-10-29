package week8nehal;

import java.util.Scanner;

public class p6TrianglePattern {

    public static void test() {
        int i, x, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows :");
        int r = sc.nextInt();

        for (i = 1; i <= r; i++) {
            for (x = 1; x <= i; x++) {
                System.out.println(x);
            }
            System.out.println("");
        }


    }


    public static void main(String[] args) {
        test();
    }
}






