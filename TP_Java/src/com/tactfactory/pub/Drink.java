package com.tactfactory.pub;

import java.util.List;

public class Drink extends Product {
    public Drink() {
    }

    public Drink(String name, float price, int stock) {
        super(name, price, stock);
    }

    public Drink(String name, float price, int stock, boolean alcohol) {
        super(name, price, stock, alcohol);
    }

    public Drink(String name, float price, int stock, String description, float vat,
            boolean alcohol) {
        super(name, price, stock, description, vat, alcohol);
    }
    
    public Drink(String name, float price, int stock, 
            boolean alcohol, List<String> ingredients) {
    	super(name, price, stock, alcohol, ingredients);
        
        
    }

    @Override
    public String toString() {
        String alcohol = (this.isAlcohol() ? "" : " Pas") + " alcolisé";
        return this.message("Drink", alcohol);
    }
}
