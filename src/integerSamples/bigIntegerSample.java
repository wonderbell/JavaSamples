package integerSamples;

import java.math.BigInteger;
import java.util.Scanner;

public class bigIntegerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger numA = sc.nextBigInteger();
        BigInteger numB = sc.nextBigInteger();

        System.out.println(numA.add(numB));
        System.out.println(numA.multiply(numB));

        sc.close();
    }
}
