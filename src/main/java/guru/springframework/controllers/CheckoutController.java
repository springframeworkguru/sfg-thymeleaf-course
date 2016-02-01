package guru.springframework.controllers;

import guru.springframework.comands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by jt on 2/1/16.
 */

@Controller
public class CheckoutController {

    @RequestMapping("/checkout")
    public String checkoutForm(){
        return "checkoutform";
    }

    @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";

    }

}
