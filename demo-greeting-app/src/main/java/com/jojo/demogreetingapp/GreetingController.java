package com.jojo.demogreetingapp;
import java.util.concurrent.atomic.AtomicLong;

import com.jojo.demogreetingapp.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String LGBTTemplate = " I'm %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name, String sexuality) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name), String.format(LGBTTemplate, sexuality));
    }

}
