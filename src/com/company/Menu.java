package com.company;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Menu actions=new Menu();
        actions.actions();
    }
    private void actions(){

        ArrayList<Product> productList=new ArrayList<Product>();

        productList.add(new Product("Carrot", 10, 3));
        productList.add(new Product("Potato", 24, 5));
        productList.add(new Product("Onion", 56, 2));
        productList.add(new Product("Tomato", 23, 3));
        productList.add(new Product("Meat", 20, 3));
        productList.add(new Product("Becon", 47, 5));

        ArrayList<Dish>  dishList = new ArrayList<Dish>();


        HashMap<Product, Double> map = new HashMap<Product, Double>();

        map.put(addProduct("Carrot",productList),10.0);
        map.put(addProduct("Potato",productList),1.0);
        dishList.add( new Dish("Borsh",  0, map));
        map.clear();

        map.put(addProduct("Meat",productList),10.0);
        map.put(addProduct("Becon",productList),10.0);
        dishList.add( new Dish("Pizza",  1, map));
        map.clear();

        map.put(addProduct("Carrot",productList),10.0);
        map.put(addProduct("Becon",productList),10.0);
        dishList.add( new Dish("Tea",  2, map));
        map.clear();

        map.put(addProduct("Carrot",productList),10.0);
        map.put(addProduct("Tomato",productList),10.0);
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

       


