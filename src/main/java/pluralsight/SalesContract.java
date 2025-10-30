package pluralsight;

public class SalesContract extends Contract {

    private double salesTax;
    private double recordingFee;
    private double processFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String email, Vehicle vehicleSold, boolean finance) {
        super(date, customerName, email, vehicleSold);
//        this.salesTax = salesTax;
//        this.recordingFee = recordingFee;
//        this.processFee = processFee;
        this.finance = finance;
    }

    @Override
    public double getMonthlyPay() {
        if (!finance){
            return 0;
        }
        
    }

    @Override
    public double getTotalPrice() {
        double vehiclePrice = getVehicleSold().getPrice(); // Grabs the vehicle price.
        salesTax = vehiclePrice * .05; // Converting it into decimal.

        recordingFee = 100;
        if (vehiclePrice < 10000) {
            processFee = 295;
        } else {
            processFee = 495;
        }

        double totalPrice = salesTax * recordingFee + processFee + vehiclePrice;

        return  totalPrice;
    }
}