package _07_lazy;

import java.util.concurrent.atomic.AtomicReference;

public class LazyJava {
    private final AtomicReference<Object> cached = new AtomicReference<>();

    public double[] getValue() {
        java.lang.Object value = this.cached.get();
        if (value == null) {
            synchronized(this.cached) {
                value = this.cached.get();
                if (value == null) {
                    final double[] actualValue = expensive();
                    value = actualValue == null ? this.cached : actualValue;
                    this.cached.set(value);
                }
            }
        }
        return (double[])(value == this.cached ? null : value);
    }

    private double[] expensive() {
        double[] result = new double[1_000_000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        System.out.println("Lazy calculated");
        return result;
    }


    public static void main(String[] args) {
        LazyJava test = new LazyJava();
        System.out.println("Before lazy calculated");
        System.out.println(test.getValue().length);
        System.out.println(test.getValue() == test.getValue());
    }
}
