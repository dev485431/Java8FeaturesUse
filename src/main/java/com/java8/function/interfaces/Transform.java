package com.java8.function.interfaces;

@FunctionalInterface
public interface Transform<F> {
    String transform(F from);
}
