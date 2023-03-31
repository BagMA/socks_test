package com.exmple.dao;

public enum Operation {
    MORE_THAN("moreThan"),
    LESS_THAN("lessThan"),
    EQUAL("equal");

    private final String state;
    Operation(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
