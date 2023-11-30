package com.datnguyen.PhishingDetection.Controller;

import com.datnguyen.PhishingDetection.Service.URLService;
import com.datnguyen.PhishingDetection.database.URLEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private URLService service;
    public TestController(URLService service){
        this.service = service;
    }

    @GetMapping(value = "/getall")
    public List<URLEntity> getAll(){
        return service.list();
    }

    @PostMapping(value = "exist")
    public boolean check(@RequestParam String URL){
        return service.existedCheck(URL);
    }
}
