package _01_variables;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariablesJava {

    public void variablesJava() {
        Map<String, List<String>> items = new HashMap<>();
        items = new HashMap<>(100);


        final Map<String, List<String>> readonlyItems = new HashMap<>();
        // readonlyItems = new HashMap<>(100); // Error
    }
}

