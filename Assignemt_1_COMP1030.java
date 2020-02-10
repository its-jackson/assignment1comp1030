/**
 * Application purpose: find invoice number and amount
 * author: jackson johnson
 * date february 10th 2020
 * 1:26pm
**/

class Vehicle {
    private String vehicleColour;
    private String invoiceNumber;
    private double invoiceAmount;
    private String vehicleBrand;

    public Vehicle() {

    }

    public Vehicle(String vehicleColour, String invoiceNumber, double invoiceAmount, String vehicleBrand) {
        this.vehicleColour = vehicleColour;
        this.invoiceNumber = invoiceNumber;
        this.invoiceAmount = invoiceAmount;
        this.vehicleBrand = vehicleBrand;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * this method finds the third digit using substing
     * and converting the thirdigit to string then back to int
    **/
    public double getShippingCost() {
        double shippingCost = 0;
        String completeState = invoiceNumber + invoiceAmount + vehicleColour + vehicleBrand;
        String thirdDigit = completeState.substring(2,3);
        int thirdDigitFinal = Integer.parseInt(thirdDigit);

        if(thirdDigitFinal == 1) {
            shippingCost = invoiceAmount * 0.015;
        } else if (thirdDigitFinal == 2) {
            shippingCost = invoiceAmount * 0.03;
        } else if (thirdDigitFinal ==  3) {
            shippingCost = invoiceAmount * 0.035;
        } else if (thirdDigitFinal == 4) {
            shippingCost = invoiceAmount *  0.05;
        } else if (thirdDigitFinal == 5) {
            shippingCost = invoiceAmount * 0.07;
        } else {
            System.out.println("Incorrect Digit!");
        }

        return shippingCost;
    }

    /**
     * this method takes vehicle color and checks if the
     * vehiclecolour is white. if true then it will print
     * a confirmation and will concat the  number 9 to the end of the invoiceNumber
    **/
    public void checkVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour.toLowerCase();

        if (vehicleColour.contains("white")) {
            System.out.println("Invoice number successfully modified. " + invoiceNumber.concat("9"));
        }
    }

}


public class VehicleInvoiceTestHarness {
    public static void main(String [] args) {
        Vehicle vehicle1 = new Vehicle("Sky white", "1234567", 45000.00, "Ford");
        System.out.println("Your vehicle colour: " + vehicle1.getVehicleColour());
        System.out.println("Your invoice number: " + vehicle1.getInvoiceNumber());
        System.out.println("Your invoice amount: " + vehicle1.getInvoiceAmount());
        System.out.println("Your vehicle brand: " + vehicle1.getVehicleBrand());
        System.out.println("Your shipping cost: " + vehicle1.getShippingCost());
        vehicle1.checkVehicleColour(vehicle1.getVehicleColour());

        System.out.println("Your vehicle colour: " + vehicle1.getVehicleColour());
        System.out.println("Your invoice number: " + vehicle1.getInvoiceNumber());
        System.out.println("Your invoice amount: " + vehicle1.getInvoiceAmount());
        System.out.println("Your vehicle brand: " + vehicle1.getVehicleBrand());
        System.out.println("Your shipping cost: " + vehicle1.getShippingCost());

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleColour("dodger blue");
        vehicle2.setInvoiceNumber("1153431");
        vehicle2.setInvoiceAmount(55000.00);
        vehicle2.setVehicleBrand("Chevy Cruze");
        System.out.println("Your vehicle colour: " + vehicle2.getVehicleColour());
        System.out.println("Your invoice number: " + vehicle2.getInvoiceNumber());
        System.out.println("Your invoice amount: " + vehicle2.getInvoiceAmount());
        System.out.println("Your vehicle brand: " + vehicle2.getVehicleBrand());
        System.out.println("Your shipping cost: " + vehicle2.getShippingCost());
        vehicle2.checkVehicleColour(vehicle2.getVehicleColour());
    }
}
