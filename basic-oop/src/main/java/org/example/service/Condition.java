package org.example.service;

public interface Condition<T> {
    boolean test(T o);
}
