package com.src.practise.oob_generic_mechanism;

/**
 * 用Object超类方式表示泛型
 */
public class MemoryCell {
    private Object storedValue;

    public void write(Object x) {
        storedValue = x;
    }

    public Object read() {
        return storedValue;
    }

}
