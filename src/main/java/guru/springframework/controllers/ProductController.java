package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class ProductController {

    public String getProduct(){
        return "product";
    }
}
