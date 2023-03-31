package com.exmple.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocksTest {

    Socks socks_test;

    @BeforeEach
    public void createSocks_test(){
        socks_test = new Socks("black", 80);
    }


    @Test
    void testGetColor() {
        assertEquals("black", socks_test.getColor());
    }

    @Test
    void testGetCottonPart() {
        assertEquals(80, socks_test.getCottonPart());
    }
}