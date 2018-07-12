package com.mkraskiewicz.springbootdocker.controllers;

import com.mkraskiewicz.springbootdocker.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Maciej on 12/07/2018
 */
@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable("id") Integer id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "product";

    }
}
