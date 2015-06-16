package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {

    public static void main(String[] args) {
	Menu actions=new Menu();
        actions.actions();
    }
    private void actions(){
        //System.out.println(inputFromKeyboard());

        Product product=new Product();
        Dish dishes = new Dish();
        ArrayList<Product> list=new ArrayList();
        product.setName("Carrot");
        product.setPrice(10);
        product.setWeigh(2);
        list.add(product);
        product.setName("Potato");
        product.setPrice(3);
        product.setWeigh(5);
        list.add(product);
        product.setName("Onion");
        product.setPrice(8);
        product.setWeigh(2);
        list.add(product);
        product.setName("Tomato");
        product.setPrice(3);
        product.setWeigh(5);
        list.add(product);

        dishes.setPetName("Borsh");
        dishes.setType(1);
        ArrayList<Product> pList = new ArrayList<Product>();

        dishes.setProduct(pList);
        System.out.println(list);
    }
    private void inputFromKeyboard(){
        /*Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter");
        String myStr = keyboard.nextLine();
        return myStr;*/


    }


}
