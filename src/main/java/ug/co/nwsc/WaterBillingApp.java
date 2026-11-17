
package ug.co.nwsc;

public class WaterBillingApp {

    public static void main(String[] args) {

        System.out.println("NWSC WATER BILLING MANAGEMENT SYSTEM");
        System.out.println("------------------------------------");

        String customerName = "John";
        double unitsConsumed = 25;
        double ratePerUnit = 3500;

        double totalBill = unitsConsumed * ratePerUnit;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate Per Unit: UGX " + ratePerUnit);
        System.out.println("Total Water Bill: UGX " + totalBill);

        System.out.println("------------------------------------");
        System.out.println("Water billing application completed.");
    }
}
