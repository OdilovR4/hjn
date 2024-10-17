package katta_kichik;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Konsoldan katta butun sonlarni o'qish
        BigInteger a = new BigInteger(in.nextLine());
        BigInteger b = new BigInteger(in.nextLine());

        // Ikkita sonning yig'indisini hisoblash va ekranga chiqarish
        BigInteger sum = a.add(b);
        System.out.println(sum.toString());

        in.close(); // Scannerni yopish
    }
}