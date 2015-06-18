package com.company;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Menu actions=new Menu();
        actions.actions();
    }
    private void actions(){

        ArrayList<Product> productList=new ArrayList<Product>();

        productList.add(new Product("Carrot", 15, 8));
        productList.add(new Product("Potato", 20, 5));
        productList.add(new Product("Onion", 5, 9));
        productList.add(new Product("Tomato", 10, 10));
        productList.add(new Product("Meat", 10, 50));
        productList.add(new Product("Water", 40, 1));
        productList.add(new Product("Becon", 5, 70));
        productList.add(new Product("Souce", 0.5, 20));
        productList.add(new Product("Fruits", 5, 35));
        productList.add(new Product("Spice", 1, 20));
        productList.add(new Product("Cheese", 5, 80));
        productList.add(new Product("Sour", 10, 15));
        productList.add(new Product("Sugar", 1, 15));
        productList.add(new Product("Salt", 1, 5));
        productList.add(new Product("CoffeBeans", 1, 100));
        productList.add(new Product("TeaLeaves", 1, 80));
        productList.add(new Product("Beet", 10, 8));
        ArrayList<Dish>  dishList = new ArrayList<Dish>();


        HashMap<Product, Double> map = new HashMap<Product, Double>();

        map.put(addProduct("Carrot",productList),0.05);
        map.put(addProduct("Tomato",productList),0.05);
        map.put(addProduct("Potato",productList),0.2);
        map.put(addProduct("Water",productList),0.3);
        map.put(addProduct("Onion",productList),0.01);
        map.put(addProduct("Beet",productList),0.02);
        map.put(addProduct("Salt",productList),0.0001);
        dishList.add( new Dish("Borsh",  1, map));
        map.clear();

        map.put(addProduct("Carrot",productList),0.05);
        map.put(addProduct("Potato",productList),0.2);
        map.put(addProduct("Water",productList),0.3);
        map.put(addProduct("Onion",productList),0.01);
        map.put(addProduct("Meat",productList),0.1);
        map.put(addProduct("Salt",productList),0.0001);
        dishList.add( new Dish("Soup",  1, map));
        map.clear();

        map.put(addProduct("Meat",productList),0.1);
        map.put(addProduct("Becon",productList),0.1);
        map.put(addProduct("Tomato",productList),0.1);
        map.put(addProduct("Sour",productList),0.4);
        map.put(addProduct("Cheese",productList),0.2);
        map.put(addProduct("Spice",productList),0.01);
        dishList.add( new Dish("Pizza",  2, map));
        map.clear();

        map.put(addProduct("Meat",productList),0.1);
        map.put(addProduct("Potato",productList),0.1);
        map.put(addProduct("Sour",productList),0.4);
        map.put(addProduct("Salt",productList),0.001);
        dishList.add( new Dish("PotatoWithMeat",  2, map));
        map.clear();
        map.put(addProduct("Meat",productList),0.1);
        map.put(addProduct("Beet",productList),0.1);
        map.put(addProduct("Tomato",productList),0.1);
        map.put(addProduct("Salt",productList),0.001);
        dishList.add( new Dish("Salat",  2, map));
        map.clear();


        map.put(addProduct("Water",productList),0.4);
        map.put(addProduct("TeaLeaves",productList),0.01);
        map.put(addProduct("Sugar",productList),0.001);
        dishList.add( new Dish("Tea",  0, map));
        map.clear();

        map.put(addProduct("CoffeBeans",productList),0.01);
        map.put(addProduct("Water",productList),0.2);
        map.put(addProduct("Sugar",productList),0.001);
        dishList.add( new Dish("Cofee",  0, map));
        map.clear();


        complexDinner(dishList, 250);

    }
    public void complexDinner(ArrayList<Dish> dishList, double price) {
        double priceTemp = 0;
        boolean flagFound=false;
        Dish[] dish = new Dish[3];
        breakLabel:
        for(int i = 0; i < dishList.size(); i++) {
            priceTemp=0;
            if(dishList.get(i).getCategory() == 0 ) {
                priceTemp += dishList.get(i).showCost();
                dish[0] = dishList.get(i);
            }
            else
                continue;
            for(int j = 0; j < dishList.size(); j++){

                if(dishList.get(j).getCategory() == 1) {
                    priceTemp += dishList.get(j).showCost();
                    dish[1] = dishList.get(j);
                }
                else
                    continue;
                for(int k = 0; k < dishList.size(); k++){

                    if(dishList.get(k).getCategory() == 2) {
                        priceTemp += dishList.get(k).showCost();
                        dish[2] = dishList.get(k);
                        if(priceTemp < price) {
                           for(int a = 0; a < dish.length; a++) {

                                System.out.println(dish[a].getPetName());
                            }
                            System.out.format("Costs %.2f UAH", priceTemp );
                            flagFound=true;
                            break breakLabel;}

                    }else
                        continue;
                }
            }
        }
    if(flagFound==false){
        System.out.println("Can't satisfy your request");}
    }






    public Product addProduct(String name,ArrayList<Product>  prList) {
        Product prod=new Product();
        for(int i=0;i<prList.size();i++){
            if(prList.get(i).getName().equals((name))){
                prod=prList.get(i);
            }
        }

        return prod;
    }

}

       


