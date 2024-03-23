/* *********************************
Title:      COSC1200-02 Assignment-3
Author:     Vaidehi Garge
Date:       MAR 11, 2024
Purpose:    includes all attributes for cars
 */

import java.util.ArrayList;

// car  class starts here
public class Car {

    // ArrayList to store car objects
    public static ArrayList<Car> cars;

    // Static variable to generate unique VIN numbers automatically
    private static int autoVin = 1;

    //<editor-fold desc="Properties">
    // Properties of the Car class
    private int vin;
    private int year;
    private String make;
    private String model;
    private String trim;
    private String color;
    private String owner;
    //</editor-fold>

    //<editor-fold desc="Constructors">

    // default constructor
    public Car( ){}

    // parameterized constructor
    public Car(int vin, int year, String make, String model,
               String trim, String color, String owner){
        setVin(vin);
        setYear(year);
        setMake(make);
        setModel(model);
        setTrim(trim);
        setColor(color);
        setOwner(owner);
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    // Getters and Setters
    public int getVin() { return vin; }
    public int getYear() { return year; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getTrim() { return trim; }
    public String getColor() { return color; }
    public String getOwner() { return owner; }

    public void setVin (int vin){
        // validation
        if (vin == 0) {
            vin = autoVin++;
        }
        this.vin = vin;
    }
    public void setYear (int year){ this.year = year; }
    public void setMake (String make){ this.make = make; }
    public void setModel (String model){ this.model = model; }
    public void setTrim (String trim){ this.trim = trim; }
    public void setColor (String color){ this.color = color; }
    public void setOwner (String owner){ this.owner = owner; }
    //</editor-fold>

    //<editor-fold desc="Instance Methods">
    // Instance Methods

    // Method to print car details
    public void printCar() {
        System.out.println(String.format("""
                 -------------------------------
                 vin: %d - %s %d %s %s %s
                    owner: %s
                 -------------------------------
                 """, getVin(), getColor(), getYear(), getMake(), getModel(), getTrim(), getOwner()));
    }

    public String toString( ) {

        return String.format("VIN: %d - Color: %s, Year: %d, Make: %s, Model: %s, Trim: %s, Owner: %s",
                getVin(), getColor(), getYear(), getMake(), getModel(), getTrim(), getOwner());
    }


    //</editor-fold>

    //<editor-fold desc="Static Methods">
    // Static Methods

    // Method to find a car by VIN in the provided list of cars
    public static Car findCarByVIN(int vin, ArrayList<Car> cars) {
        Car retCar = new Car();
        for (Car car: cars) {
            if (car.getVin() == vin) retCar = car;
            return retCar;
        }
        return null;
    }

    // Method to convert car objects into a formatted table
    public static String toTable(ArrayList<Car> cars) {
        StringBuilder table = new StringBuilder();
        table.append(String.format("%5s | %10s | %4s | %10s | %10s | %20s%n", "VIN", "COLOR", "YEAR", "Make", "Model", "Owner"));
        table.append("-----|------------|------|------------|------------|---------------------\n \n");
        for (Car car : cars) {
            table.append(String.format("%5d | %10s | %4d | %10s | %10s | %20s%n",
                    car.getVin(), car.getColor(), car.getYear(), car.getMake(), car.getModel(), car.getOwner()));
        }
        return table.toString();
    }
    //</editor-fold>
}

public void setYear(int year) throws CarYearException {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    if (year < 1890 || year > currentYear + 1) {
        throw new CarYearException("Year must be within the range 1890 and the year following the current year.");
    }
    this.year = year;
}