package pl.kskowronski.paymentvalidationservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment-validation-service")
public class PaymentController {

    @PostMapping("/webhook")
    public String webhook(@RequestBody String paymentInfo) {
        System.out.println(paymentInfo);
        return "Hello World";
    }

}
