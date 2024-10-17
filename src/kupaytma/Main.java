package kupaytma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long Z = scanner.nextLong();
        int count = 0;

        if (Z == 0) {
            count = -1;
        } else if (Z > 0) {
            for (long X = 1; X * X <= Math.abs(Z); X++) {
                if (Z % X == 0) {
                    long Y = Z / X;
                    if (X <= Y) {
                        count++;
                    }
                }
            }

        } else {
            for (long X = -1; X * X >= Math.abs(Z); X--) {
                if (Z % X == 0) {
                    long Y = Z / X;

                    if (X <= Y) {
                        count++;
                    }
                }
            }
        }


        System.out.println(count);
    }
}
