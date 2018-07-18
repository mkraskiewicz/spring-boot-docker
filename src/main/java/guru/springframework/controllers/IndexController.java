package guru.springframework.controllers;

import guru.springframework.model.events.PageViewEvent;
import guru.springframework.pageview.PageViewService;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Maciej on 12/07/2018
 */
@Controller
public class IndexController {

    private ProductService productService;
    private PageViewService pageViewService;
    @Autowired
    public IndexController(ProductService productService, PageViewService pageViewService) {
        this.productService = productService;
        this.pageViewService = pageViewService;
    }

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){

        PageViewEvent pageViewEvent = new PageViewEvent();
        pageViewEvent.setPageViewDate(new Date());
        pageViewEvent.setPageUrl("springframework.guru");
        pageViewEvent.setCorrelationId(UUID.randomUUID().toString());

        pageViewService.sendPageViewEvent(pageViewEvent);


        model.addAttribute("products", productService.listProducts());

        return "index";
    }

}
