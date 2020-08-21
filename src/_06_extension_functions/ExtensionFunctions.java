package _06_extension_functions;

import java.util.ArrayList;
import java.util.Arrays;

class ExtensionFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.swap(list,0, 2);
        System.out.println(list);
    }
}

class Collections {
    public static <T> void swap(ArrayList<T> list, int index1, int index2) {
        var tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}
