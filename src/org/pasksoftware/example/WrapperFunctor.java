package org.pasksoftware.example;


import org.pasksoftware.functor.Functor;

import java.util.function.Function;

public class WrapperFunctor<T> implements Functor<T> {

    private final T value;

    public WrapperFunctor(T value) {
        this.value = value;
    }

    @Override
    public <R> WrapperFunctor<R> map(Function<T, R> f) {
        return new WrapperFunctor<>(f.apply(value));
    }

    // For sake of asserting in Example
    boolean valueEquals(T x) {
        return value.equals(x);
    }
}
