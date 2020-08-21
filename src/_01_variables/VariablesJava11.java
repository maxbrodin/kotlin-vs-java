package _01_variables;

import java.util.HashMap;
import java.util.function.BiFunction;

public class VariablesJava11 {
    public void variablesJava11() {
        var items = new HashMap<>();
        items = new HashMap<>(100);

        final var readonlyItems = new HashMap<>();
        // readonlyItems = new HashMap<>(100); // Error

        // var foo;   // Error: type can't be inferred
        // foo = "Foo";

        final BiFunction<Integer, Integer, Integer> lambdaSum = (Integer x, Integer y) -> { return x + y; };
        // var lambdaInferred = (Integer x, Integer y) -> { return x + y; };   // Error: type can't be inferred
    }
}

