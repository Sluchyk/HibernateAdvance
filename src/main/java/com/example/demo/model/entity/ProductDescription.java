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
@Getter
@Setter
public class ProductDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productDescriptionId;
    private String description;

    public ProductDescription(String description) {
        this.description = description;
    }


}
