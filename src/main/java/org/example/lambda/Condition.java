package org.example.lambda;

public interface Condition {
    boolean isAppropriate(int n);

    static int sum(int[] numbers, Condition condition) {
        int result = 0;
        for (int i : numbers) {
            if (condition.isAppropriate(i)) {
                result += i;
            }
        }
        return result;
    }
}
