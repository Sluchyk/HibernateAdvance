package com.example.demo.sevice;

import com.example.demo.model.ProductRepository;
import com.example.demo.model.entity.Category;
import com.example.demo.model.entity.Product;
import com.example.demo.model.entity.ProductDescription;
import com.example.demo.model.entity.ProductParameter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    void init() {
        Product product = new Product("Table", new BigDecimal(1546));
        Product product1 = new Product("chair", new BigDecimal(340));
        ProductParameter productParameter = new ProductParameter(23, 40);
        ProductParameter productParameter1 = new ProductParameter(15, 34);
        Category category = new Category("Table");
        Category category1 = new Category("Chair");
        Category category2 = new Category("Furniture");
        ProductDescription productDescription = new ProductDescription("color is brown,done with oak in Ukraine");
        ProductDescription productDescription1 = new ProductDescription("color is white,done with nut tree in Poland");
        product.setProductParameter(List.of(productParameter, productParameter1));
        product1.setProductDescription(productDescription1);
        product.setProductDescription(productDescription);
        product1.setProductParameter(List.of(productParameter1));
        product.setCategoryList(List.of(category, category2));
        product1.setCategoryList(List.of(category1, category2));
        productRepository.saveAll(List.of(product, product1));
    }


    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }


}
