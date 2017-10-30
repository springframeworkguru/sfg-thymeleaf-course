package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class ProductController {

    @RequestMapping("/product")
    public String getProduct(){
        return "product";
    }
}
