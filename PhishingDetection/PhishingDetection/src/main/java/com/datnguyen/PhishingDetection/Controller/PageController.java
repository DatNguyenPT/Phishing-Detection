package com.datnguyen.PhishingDetection.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping(value="/")
    public String dashboard(){
        return "index";
    }

    @GetMapping(value="/info")
    public String info(){
        return "URLInfo";
    }
}
