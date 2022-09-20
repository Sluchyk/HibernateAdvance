package com.example.demo.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Setter
@Getter
public class ProductParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productParameterId;
    private int size;
    private int weight;

    public ProductParameter(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }
}
