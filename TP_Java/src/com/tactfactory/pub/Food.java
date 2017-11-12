package com.tactfactory.pub;

import java.util.List;

public class Food extends Product {
    private boolean meat;

    public Food()
    {}

    public Food(String name, float price, int stock) {
        super(name, price, stock);
    }

    public Food(String name, float price, int stock, boolean meat) {
        this(name, price, stock);

        this.meat = meat;
    }
    
    public Food(String name, float price, int stock, boolean alcohol,
            boolean meat, List<String> ingredients) {
    	super(name, price, stock, alcohol, ingredients);
    	
    	this.meat = meat;
        
        
    }

    @Override
    public String toString() {
        return this.message("Food", "");
    }

    public boolean isMeat() {
        return this.meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }
}
