package pluralsight;

public class LeaseContract extends Contract{

   private double endValue;
   private double leaseFee;

    public LeaseContract(String date, String customerName, String email, String vehicleSold) {
        super(date, customerName, email, vehicleSold);
        this.endValue = endValue;
        this.leaseFee = leaseFee;
    }


    @Override
    public double getMonthlyPay() {
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
