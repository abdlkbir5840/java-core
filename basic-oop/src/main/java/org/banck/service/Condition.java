package org.banck.service;

public interface Condition<T> {
    boolean test(T o);
}
