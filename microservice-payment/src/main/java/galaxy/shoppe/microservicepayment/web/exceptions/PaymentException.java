package galaxy.shoppe.microservicepayment.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PaymentException extends RuntimeException{

    public PaymentException(String message) {
        super(message);
    }
}
