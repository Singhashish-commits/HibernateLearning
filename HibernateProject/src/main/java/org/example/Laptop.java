package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

   @Id
    private int lid;
    private String brand;
    private String Model;
    private int ram;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
