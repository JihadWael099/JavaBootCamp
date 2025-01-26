package com.adminPanel.app.controller;

import com.adminPanel.app.dao.ProductDaoImp;
import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequestMapping("/products")
public class HomeController {

    private final ProductDaoImp productDaoImp;


    @Autowired
    public HomeController(ProductDaoImp productDaoImp) {
        this.productDaoImp = productDaoImp;
    }

    @GetMapping("/list")
    public String listProducts(Model model) {
        List<Product> products = productDaoImp.findAll();
        model.addAttribute("products", products);
        return "homePage";
    }

    @GetMapping("/addForm")
    public String addProductPage(Model model) {
        Product product = new Product();
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProduct(product);
        product.setProductDetails(productDetails);

        model.addAttribute("productModel", productDetails);
        return "addProductForm";
    }

    @PostMapping("/addProduct")
    public String processAddProduct(@Valid @ModelAttribute("productModel") ProductDetails product, BindingResult result) {
        if (result.hasErrors()) {
            return "addProductForm";
        }

        productDaoImp.save(product);
        return "redirect:/products/list";
    }
}
