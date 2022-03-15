public class BusinessUBBTest {
    public static void main(String[] args) {
        PaymentLogic paymentLogic = new PaymentLogic(4000);

        Fee fee = new Fee(4000, "RON", FeeType.ANNUAL, 0);
// new lesons - call back-uri
        paymentLogic.payFee(fee, new FeeResponse() {
            @Override
            public void success(String successMessage) {
                System.out.println(successMessage);
            }

            @Override
            public void error(String errorMessage) {
                System.out.println(errorMessage);
            }
        });
    }
}
