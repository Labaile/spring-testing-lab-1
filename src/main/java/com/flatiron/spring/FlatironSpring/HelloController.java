package com.flatiron.spring.FlatironSpring;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    //@GetMapping("/reverse")  //new endpoint called reverse
    public String hello (String reverseString){
        //return the reverse of the string
        //return StringUtils.reverse(reverseString);

        //uppercase
        //return StringUtils.toRootUpperCase(reverseString);

        //lowercase
        //return StringUtils.toRootLowerCase(reverseString);

        //mixed case
        return StringUtils.capitalize(reverseString);

        //spaces and words with numbers in them

    }


    //@GetMapping("/hello")
    //public String hello() {
      //  return "Hello World";

    //public String hello(String name) {
      //  return String.format("Hello %s", name);
    //}
}