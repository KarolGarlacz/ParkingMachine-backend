package pl.garlacz.karol.model;

import javax.persistence.*;


public class Ticket {

    private int id;
    private String brand;
    private String model;
    private String plate;
    private int quantity;

    public Ticket() {
    }

    public Ticket(int id, String brand, String model, String plate, int quantity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.quantity = quantity;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}