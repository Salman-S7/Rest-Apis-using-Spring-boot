package com.restApis.learning.REST.APIs.hellowWolrld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

record Student(int rollNum, String name) {
}

@RestController
public class HelloWorldController {
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello world   ! ! !" + name;
    }

    //Will give json response back
    @GetMapping("hellojson")
    public Student getJsonStudnet() {
        return new Student(1, "salman");
    }

}
