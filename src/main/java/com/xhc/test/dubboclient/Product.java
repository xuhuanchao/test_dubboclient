package com.xhc.test.dubboclient;

import java.io.Serializable;

public class Product implements Serializable{

    private int id;
    private String name;
    private float price;
    private String productPlace;
    
    public Product() {
        super();
    }
    
    public Product(int id, String name, float price, String productPlace) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.productPlace = productPlace;
    }


    @Override
    public String toString() {
        return "{id:"+id+" , name:"+name+" , price:"+price+" , productPlace:"+productPlace+"}";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getProductPlace() {
        return productPlace;
    }
    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
