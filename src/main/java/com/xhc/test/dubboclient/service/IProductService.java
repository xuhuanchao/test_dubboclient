package com.xhc.test.dubboclient.service;

import java.util.List;

import com.xhc.test.dubboclient.Product;

public interface IProductService {

    public List<Product> getAll();
    public Product getByName(String name);
    public void delByName(String name);
    
}
