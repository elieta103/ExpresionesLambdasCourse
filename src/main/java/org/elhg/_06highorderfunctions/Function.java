package org.elhg._06highorderfunctions;

@FunctionalInterface
public interface Function<T, R> {
    R apply (T t);
}
