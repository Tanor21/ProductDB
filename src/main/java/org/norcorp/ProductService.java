package org.norcorp;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    ProductDB db = new ProductDB();

    // add a product to the list
    public void addProduct(Product p) {
        //products.add(p);

        db.save(p);


    }
    // get all products from the list
    public List<Product> getAllProducts() {
        //return products;

        return db.getAll();
    }
    // get a particular product by his name
    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

    // get a List of products by text
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;
    }





}
