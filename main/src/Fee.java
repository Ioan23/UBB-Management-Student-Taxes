public class Fee {
    private double amount;
    private String currency;
    private double discount;
    private FeeType feeType;
    private String blabla;


    public <feeType> Fee(double amount, String currency, double discount, FeeType feeType){
        this.amount=amount;
        this.currency=currency;
        this.discount=discount;
        this.feeType=feeType;
    }
}
