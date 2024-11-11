package pl.kskowronski.bookservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String get() {
        return "Hello World. my id is " + id;
    }
}