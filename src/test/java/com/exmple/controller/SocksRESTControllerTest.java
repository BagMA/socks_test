package com.exmple.controller;

import com.exmple.dao.SocksRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureMockMvc
class SocksRESTControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SocksRepository socksRepository;

    @Test
    void showAllSocks() {
    }
}