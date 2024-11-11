package pl.kskowronski.bookservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book-service")
@CrossOrigin("*")
public class BookController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String get() {
        return "Hello World. my id is " + id;
    }

    @GetMapping("/get-ebooks")
    public List<Ebook> getEbooks() {
        List<Ebook> ebooks = List.of(
                new Ebook("Book Spring Live 1 ", "100zł", "Klaudiusz Skowronski", "https://assets.blurb.com/pages/website-assets/lp-homepage/3_Tradebooks-922752db04177f3417c8505ff1970f9d88be19f966cff7ce4654bd85c5073ac3.png", "https://buy.stripe.com/test_5kAbIL0Xt279bzW7ss")
        , new Ebook("Book Java Live 2 ", "200zł", "Klaudiusz Skowronski", "https://pngimg.com/d/book_PNG2111.png", "")
        );
        return ebooks;
    }

}
