package pluralsight;

public class SalesContract extends Contract {

    private double salesTax;
    private double recordingFee;
    private double processFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String email, String vehicleSold, boolean finance) {
        super(date, customerName, email, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processFee = processFee;
        this.finance = finance;
    }

    @Override
    public double getMonthlyPay() {}

        @Override
        public double getTotalPrice () {
            return 0;
        }


}