package com.mkraskiewicz.springbootdocker.controllers;

import com.mkraskiewicz.springbootdocker.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Maciej on 12/07/2018
 */
@Controller
public class IndexController {

    private ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){

        model.addAttribute("products", productService.listProducts());

        return "index";
    }
}
