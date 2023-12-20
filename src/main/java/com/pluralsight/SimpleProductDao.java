package com.pluralsight;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void initialize() {
        add(new Product(1, "Laptop", "Electronics", 999.99));
        add(new Product(2, "Book", "Literature", 19.99));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }
}
