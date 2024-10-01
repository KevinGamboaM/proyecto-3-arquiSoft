@RestController
@RequestMapping("/payment")
public class PaymentController {
    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@RequestBody PaymentRequest request) {
        // Lógica simulada para procesar el pago
        if ("1234".equals(request.getCardNumber())) {
            return ResponseEntity.ok("Payment approved");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Payment declined");
    }
}

class PaymentRequest {
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private Double amount;

    // Getters y setters
}
