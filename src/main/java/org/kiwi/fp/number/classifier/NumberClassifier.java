package org.kiwi.fp.number.classifier;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * 1. No shared state
 * 2. High-Order Functions
 */

public class NumberClassifier {

    public static boolean isPerfect(int num) {
        return sumFactors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumFactors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumFactors(num) < num;
    }

    private static int sumFactors(int num) {
        return IntStream.range(1, num - 1).parallel().filter(isFactor(num)).reduce(0, (left, right) -> left + right);
    }

    private static IntPredicate isFactor(int potentialFactor) {
        return n -> potentialFactor % n == 0;
    }
}
