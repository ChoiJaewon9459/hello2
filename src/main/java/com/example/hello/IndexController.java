package com.example.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/search")
    public String search(){

        return "search";
    }
    @GetMapping("/foodlist")
    public String foodlist(){

        return "foodlist";
    }
    @GetMapping("/movie")
    public String movie(){

        return "movie";
    }
}
