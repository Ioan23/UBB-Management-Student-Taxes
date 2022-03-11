public class Fee {
    private double amount = 3000.0;
    private String currency =  "RON";
    private double discount = 0;
    private FeeType feeType;

    public <feeType> Fee(double amount, String currency, double discount, FeeType feeType){
        this.amount=amount;
        this.currency=currency;
        this.discount=discount;
        this.feeType=feeType;
    }

    public Fee() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

}
