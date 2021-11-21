package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestControllerTest {
    @Test
    @DisplayName("sss")
    void name() {
        final Map<String, String> getenv = System.getenv();
        for (String s : getenv.keySet()) {
            System.out.println("Key : " + s + ", Value : " + getenv.get(s));
        }
    }
}