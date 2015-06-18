package com.company;

import java.util.*;

public class Dish {
    private HashMap<Product, Double> map = new HashMap<Product, Double>();

    private String petName;
    private int category;

    public HashMap<Product, Double> getMap() {
        return map;
    }



    //Designers
    public Dish() {
    }

    public Dish(String petName, int cat, HashMap<Product, Double> map) {

        this.petName = petName;
        this.category = cat;
        this.map.putAll(map);
    }




    public void setPetName(String name) {
        this.petName = name;
    }

    public String getPetName() {
        return petName;
    }

    public void setCategory(int cat) {
        this.category = cat;
    }

    public int getCategory() {
        return category;
    }




    public void getAll() {
        System.out.println("Dish name: " + getPetName() + ";");
        System.out.format("%.2f UAH", showCost() );
        for(Map.Entry<Product, Double> entry : map.entrySet()) {
            System.out.println("Product: " + entry.getKey().getName() + ". Weight: " +entry.getValue());
        }
    }



    public double showCost() {

        double result=0;

        for(Map.Entry<Product, Double> entry : map.entrySet()) {

            result+=entry.getKey().getCost()*entry.getValue();


        }

        return result;

    }
}


