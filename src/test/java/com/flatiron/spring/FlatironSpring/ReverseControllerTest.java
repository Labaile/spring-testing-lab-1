package com.flatiron.spring.FlatironSpring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseControllerTest {
    @Test
    void reverse() {
        ReverseController reverseController = new ReverseController();
        String name = "Jamie";
        assertEquals("eimaJ", reverseController.reverse(name));

    }

    @Test
    void reverseUppercase() {
        ReverseController reverseController = new ReverseController();
        String name = "JAMIE";
        assertEquals("EIMAJ", reverseController.reverse(name));

    }

    @Test
    void reverseLowercase() {
        ReverseController reverseController = new ReverseController();
        String name = "jamie";
        assertEquals("eimaj", reverseController.reverse(name));

    }

    @Test
    void reverseMixedcase() {
        ReverseController reverseController = new ReverseController();
        String name = "JaMiE";
        assertEquals("EiMaJ", reverseController.reverse(name));

    }

    @Test
    void reverseWithNumbers() {
        ReverseController reverseController = new ReverseController();
        String name = "2211334455";
        assertEquals("5544331122", reverseController.reverse(name));

    }

    @Test
    void reverseWithSpaces() {
        ReverseController reverseController = new ReverseController();
        String name = "lynn rita";
        assertEquals("aitr nnyl", reverseController.reverse(name));

    }



}