package com.flatiron.spring.FlatironSpring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    @Test
    void hello() {
        //HelloController helloController = new HelloController();
        //assertEquals("Hello World", helloController.hello());

        //Reverses the string
       // HelloController helloController = new HelloController();
       // String name = "Jamie";
       // assertEquals("eimaJ", helloController.hello(name));

        //to uppercase
        //HelloController helloController = new HelloController();
        //String name = "Jamie";
        //assertEquals("JAMIE", helloController.hello(name));

        //to lowercase
        //HelloController helloController = new HelloController();
        //String name = "Jamie";
        //assertEquals("jamie", helloController.hello(name));

        //mixed case
        HelloController helloController = new HelloController();
        String name = "jaMiE";
        assertEquals("Jamie", helloController.hello(name));

        //spaces and words with numbers in them
        //HelloController helloController = new HelloController();
        //String name = "Jamie";
        //assertEquals("jamie", helloController.hello(name));


    }
}