package com.pluralsight;

import java.io.*;
import java.rmi.dgc.Lease;

public class ContractDataManager {
    public void saveContract(Contract contract) {

        if (contract instanceof SalesContract) {
            try {
                //Create a FileWriter and BufferedWriter:
                FileWriter fw = new FileWriter("contracts.csv", true);
                BufferedWriter bw = new BufferedWriter(fw);

                SalesContract sale = (SalesContract) contract;

                String saleData = "Sale" + "|" +
                        sale.getDate() + "|" +
                        sale.getCustomerName() + "|" +
                        sale.getEmail() + "|" +
                        sale.getVehicleSold().getVin() + "|" +
                        sale.getVehicleSold().getYear() + "|" +
                        sale.getVehicleSold().getMake() + "|" +
                        sale.getVehicleSold().getModel() + "|" +
                        sale.getVehicleSold().getVehicleType() + "|" +
                        sale.getVehicleSold().getColor() + "|" +
                        sale.getVehicleSold().getOdometer() + "|" +
                        sale.getVehicleSold().getPrice() + "|" +
                        sale.getVehicleSold().getVin() + "|" +
                        sale.getSalesTax() + "|" +
                        sale.getRecordingFee() + "|" +
                        sale.getProcessFee() + "|" +
                        sale.getTotalPrice() + "|" +
                        sale.isFinance() + "|" +
                        sale.isFinance() + "|" +
                        sale.getMonthlyPay();

                bw.write(saleData);
                bw.newLine();

                bw.close();
                System.out.println("Sale Contract saved successfully!");

            } catch (IOException e) {
                System.out.println("Something went wrong..");
            }
        }

        if (contract instanceof LeaseContract) {
            try {
                //Create a FileWriter and BufferedWriter:
                FileWriter fw = new FileWriter("contracts.csv", true);
                BufferedWriter bw = new BufferedWriter(fw);
                LeaseContract lease = (LeaseContract) contract;

                String leaseData = "Lease" + "|" +
                        lease.getDate() + "|" +
                        lease.getCustomerName() + "|" +
                        lease.getEmail() + "|" +
                        lease.getVehicleSold().getVin() + "|" +
                        lease.getVehicleSold().getYear() + "|" +
                        lease.getVehicleSold().getMake() + "|" +
                        lease.getVehicleSold().getModel() + "|" +
                        lease.getVehicleSold().getVehicleType() + "|" +
                        lease.getVehicleSold().getColor() + "|" +
                        lease.getVehicleSold().getOdometer() + "|" +
                        lease.getVehicleSold().getPrice() + "|" +
                        lease.getVehicleSold().getVin() + "|" +
                        lease.getEndValue() + "|" +
                        lease.getLeaseFee() + "|" +
                        lease.getTotalPrice() + "|" +
                        lease.getMonthlyPay();

                bw.write(leaseData);
                bw.newLine();

                bw.close();
                System.out.println("Lease Contract saved successfully!");

            } catch (IOException e) {
                System.out.println("Something went wrong..");
            }
        }
    }
}