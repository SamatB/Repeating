package org.example.lambda.functionalinterface;

@FunctionalInterface
public interface Function <T, R>{
    R apply(T t);
}
