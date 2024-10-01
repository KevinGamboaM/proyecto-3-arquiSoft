@SpringBootTest
@AutoConfigureMockMvc
public class PaymentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testProcessPayment() throws Exception {
        String json = "{\"cardNumber\":\"1234\",\"cvv\":\"123\",\"expiryDate\":\"12/23\",\"amount\":100.0}";
        mockMvc.perform(post("/payment/process").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("Payment approved"));
    }
}
