package com.company;
import java.util.ArrayList;
public class Dish {
    private int price;
    String petName;
    int type;
    ArrayList product;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList getProduct() {
        return product;
    }

    public void setProduct(ArrayList product) {
        this.product = product;
    }
}
