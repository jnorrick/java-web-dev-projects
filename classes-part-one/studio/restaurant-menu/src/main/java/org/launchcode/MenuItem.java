package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew(){
        return isNew;
    }


}
