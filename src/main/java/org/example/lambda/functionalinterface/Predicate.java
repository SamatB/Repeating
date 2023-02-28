package org.example.lambda.functionalinterface;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
