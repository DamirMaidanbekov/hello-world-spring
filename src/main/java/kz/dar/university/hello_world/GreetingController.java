package kz.dar.university.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(String.format(template, name));
    }
}
