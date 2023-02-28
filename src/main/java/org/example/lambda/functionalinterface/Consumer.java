package org.example.lambda.functionalinterface;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
