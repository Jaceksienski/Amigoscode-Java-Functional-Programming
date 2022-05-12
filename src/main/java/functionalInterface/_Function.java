package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
