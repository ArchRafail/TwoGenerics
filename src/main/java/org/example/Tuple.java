package org.example;

public class Tuple<T, K> {
    private T first;
    private K second;

    private Tuple(T valueT, K valueK) {
        this.first = valueT;
        this.second = valueK;
    }

    public static <T, K> Tuple<T, K> of(T valueT, K valueK) {
        return new Tuple<>(valueT, valueK);
    }

    public static <T, K> Tuple<T, K> of(T valueT) {
        return of(valueT, null);
    }

    public static <T, K> Tuple<T, K> of() {
        return of(null, null);
    }

    public void setFirst(T valueT) {
        this.first = valueT;
    }

    public void setSecond(K valueK) {
        this.second = valueK;
    }

    public T getFirst() {
        return this.first;
    }

    public K getSecond() {
        return this.second;
    }
}
