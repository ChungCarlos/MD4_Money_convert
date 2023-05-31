package com.example.chuyendoitiente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RunController {

    @RequestMapping()
    public String home() {
        return "index";
    }

    @RequestMapping(value = "convert", method = RequestMethod.POST)
    public String convertCurrency(@RequestParam("rate") double rate,
                                  @RequestParam("usd") double usd,
                                  Model model) {
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "result";
    }

}
