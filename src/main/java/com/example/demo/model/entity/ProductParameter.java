package com.example.demo.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ProductParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productParameterId;
    private int size;
    private int weight;

    public ProductParameter() {
    }

    public ProductParameter(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public Long getProductParameterId() {
        return productParameterId;
    }

    public void setProductParameterId(Long productParameterId) {
        this.productParameterId = productParameterId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
