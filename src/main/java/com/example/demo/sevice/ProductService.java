package com.example.demo.sevice;

import com.example.demo.model.repository.ProductRepository;
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
        Product productTable = new Product("Table", new BigDecimal(1546));
        Product productChair = new Product("chair", new BigDecimal(340));
        ProductParameter productParameter = new ProductParameter(23, 40);
        ProductParameter productParameterOne = new ProductParameter(15, 34);
        Category categoryTable = new Category("Table");
        Category categoryChair = new Category("Chair");
        Category categoryFurniture = new Category("Furniture");
        ProductDescription productDescriptionColorBrown = new ProductDescription("color is brown,done with oak in Ukraine");
        ProductDescription productDescriptionColorWhite = new ProductDescription("color is white,done with nut tree in Poland");
        productTable.setProductParameter(List.of(productParameter, productParameterOne));
        productChair.setProductDescription(productDescriptionColorWhite);
        productTable.setProductDescription(productDescriptionColorBrown);
        productChair.setProductParameter(List.of(productParameterOne));
        productTable.setCategoryList(List.of(categoryTable, categoryFurniture));
        productChair.setCategoryList(List.of(categoryChair, categoryFurniture));
        productRepository.saveAll(List.of(productTable, productChair));
    }


    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }


}
