package mybootlab.controller;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import mybootlab.model.Customer;
import mybootlab.repository.CustomerRepository;
import mybootlab.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class  GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
