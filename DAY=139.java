import java.io.*;
import java.util.*;

public class Solution {

    public static void staircase(int n) {

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print #
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        staircase(n);

        sc.close();
    }
}