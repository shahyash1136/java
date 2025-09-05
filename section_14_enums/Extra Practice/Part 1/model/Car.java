package model;

import constants.BodyType;
import constants.Contants;

public class Car {
    private String make;
    private String model;
    private BodyType bodyType; // Should this really be a String?
    private int productionYear;
    private double price;

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("Body Type cannot be null or blank.");
        }
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < Contants.MIN_YEAR) {
            throw new IllegalArgumentException(
                    "Production year must be greater than or equal to the " + Contants.MIN_YEAR + ".");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < Contants.MIN_PRICE || price > Contants.MAX_PRICE) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }

}