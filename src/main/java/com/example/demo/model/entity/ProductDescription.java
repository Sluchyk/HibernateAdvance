package com.example.demo.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productDescriptionId;
    private String description;

    public ProductDescription() {
    }

    public ProductDescription(String description) {
        this.description = description;
    }

    public Long getProductDescriptionId() {
        return productDescriptionId;
    }

    public void setProductDescriptionId(Long productDescriptionId) {
        this.productDescriptionId = productDescriptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
