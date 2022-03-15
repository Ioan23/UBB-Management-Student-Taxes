public class Fee {
    private double amount;
    private String currency;
    private double discount = 0;
    private FeeType feeType;

    public Fee(double amount, String currency, FeeType feeType, double discount){
        this.amount=amount;
        this.currency=currency;
        this.feeType=feeType;
        this.discount = discount;
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
