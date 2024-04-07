package com.bellwood.bellwoodinterview.controllers;

import com.bellwood.bellwoodinterview.models.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

    private Controller controller;

    @BeforeEach
    void setUp() {
        this.controller = new Controller();
    }

    @Test
    void test() {
        assertEquals("A specific business logic", this.controller.getByType(Type.A).getBody());
    }

}