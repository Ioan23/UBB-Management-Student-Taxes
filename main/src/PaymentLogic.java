public class PaymentLogic {

    private double totalAmount;

    public PaymentLogic(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void payFee(Fee fee, FeeResponse response){
        switch (fee.getFeeType()) {
            case ANNUAL -> {
                if(fee.getAmount() == totalAmount) {
                    //send data to server
                    response.success("Anual Payment success");
                } else {
                    // show error to user
                    response.error("Amount should be "+totalAmount);
                }
                break;
            }
            case QUARTERLY -> {
                double amount = totalAmount / 3;
                if(fee.getAmount() == amount) {
                    // send data to server
                    response.success("Quarter Payment success");
                } else {
                    // error
                    response.error("Amount should be "+amount);
                }
            }
        }
    }
}

interface FeeResponse {
    void success(String successMessage);
    void error(String errorMessage);
}

