/* *********************************
Title:      COSC1200-02 Assignment-3
Author:     Vaidehi Garge
Date:       MAR 11, 2024
Purpose:   Includes all maintenance details of car
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Maintenance {

    // ArrayList to store all maintenance objects
    public static ArrayList<Maintenance> maintenanceList = new ArrayList<>();
    // Static variable to generate unique invoice IDs
    private static int nextInvoiceID = 1001;

    // Maintenance attributes
    private int invoiceID;
    private int carVin;
    private String serviceCode;
    private double price;
    private LocalDate date;
    private String notes;

    // Constructors
    public Maintenance(String vin, String serviceCode, double price, String date, String notes) {
        setDefaults();
    }

    public Maintenance(int carVin, String serviceCode, double price, String date, String notes) {
        this.invoiceID = nextInvoiceID;
        this.carVin = carVin;
        this.serviceCode = serviceCode;
        this.price =price;
        this.date = LocalDate.parse(date);
        this.notes= notes;
        nextInvoiceID += 13;        // Increment invoice ID for next maintenance
    }

    // Getters and setters for maintenance attributes
    public int getInvoiceID() {
        return invoiceID;
    }

    private void setInvoiceID() {

    }

    public int getCarVin() {
        return carVin;
    }

    public void setCarVin(int carVin) {
        this.carVin = carVin;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Override toString method to provide formatted string representation of Maintenance object
    @Override
    public String toString() {
        return String.format("""
                Invoice ID: %d
                Car VIN: %d
                Service Code: %s
                Price: %.2f
                Date: %s
                Notes: %s
                """, invoiceID, carVin, serviceCode, price, date, notes);
    }

    // Generate a formatted table of maintenance details
    public static String toTable(ArrayList<Maintenance> maintenanceList) {
        StringBuilder table = new StringBuilder();
        table.append(String.format("| %-10s | %-10s | %-10s | %-15s | %-10s | %-10s |%n", "Invoice ID", "Car VIN", "Service Code", "Price", "Date", "Notes"));
        table.append("|------------|------------|------------|-----------------|------------|------------| \n\n");
        for (Maintenance maintenance : maintenanceList) {
            table.append(String.format("| %-10d | %-10d | %-10s | %-15.2f | %-10s | %-10s |%n",
                    maintenance.getInvoiceID(), maintenance.getCarVin(), maintenance.getServiceCode(),
                    maintenance.getPrice(), maintenance.getDate(), maintenance.getNotes()));
        }
        return table.toString();
    }

    // Find a maintenance object by its invoice ID
    public static Maintenance findMaintenanceByInvoiceID(int invoiceID, ArrayList<Maintenance> maintenanceList) {
        for (Maintenance maintenance : maintenanceList) {
            if (maintenance.getInvoiceID() == invoiceID) {
                return maintenance;
            }
        }
        return null;        // Return null if maintenance with given invoice ID is not found
    }

    // Initialize maintenance attributes with default values
    private void setDefaults() {
        this.invoiceID = nextInvoiceID;
        nextInvoiceID += 13;
        this.carVin = 0;
        this.serviceCode = "na";
        this.price = 0.00;
        // Set default date to today's date
        this.date = LocalDate.parse("");
        this.notes = "";
    }
}