package com.mkraskiewicz.springbootdocker.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciej on 12/07/2018
 */
@Data
public class Product {

    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> productCategories = new ArrayList();
    private String imageUrl;
}
