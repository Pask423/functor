package org.pasksoftware.functor;

import java.util.function.Function;

public final class ReferentialFunctor<T> implements Functor<T> {

    private final T value;

    public ReferentialFunctor(T value) {
        this.value = value;
    }

    @Override
    public <R> ReferentialFunctor<R> map(Function<T, R> f) {
        return new ReferentialFunctor<>(f.apply(value));
    }

    // For sake of Laws validation
    boolean valueEquals(T x) {
        return value.equals(x);
    }
}
