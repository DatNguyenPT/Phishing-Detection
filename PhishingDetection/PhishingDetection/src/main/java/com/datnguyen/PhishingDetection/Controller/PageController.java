package com.datnguyen.PhishingDetection.Controller;

import com.datnguyen.PhishingDetection.ErrorHandler.ErrorHandling;
import com.datnguyen.PhishingDetection.Repository.URLRepo;
import com.datnguyen.PhishingDetection.Service.URLService;
import com.datnguyen.PhishingDetection.database.URLEntity;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.HashMap;

@Controller
public class PageController {
    private URLRepo urlRepo;
    private AnalystController analystController;
    private URLService urlService;
    PageController(URLRepo urlRepo, AnalystController analystController, URLService urlService){
        this.urlRepo = urlRepo;
        this.analystController = analystController;
        this.urlService = urlService;
    }
    @GetMapping(value="/")
    public String dashboard(Model model){
        model.addAttribute("newURL", new URLEntity());
        return "index";
    }

    @PostMapping(value ="/analystfromdataset")
    public String analyst(@RequestParam String URL, Model model){
        HashMap<String, String>map = urlService.analystFromDataset(URL);
        model.addAttribute("url", map.get("URL"));
        model.addAttribute("length", map.get("LENGTH"));
        model.addAttribute("ip", map.get("IP"));
        model.addAttribute("status", map.get("STATUS"));
        return "URL Info";
    }
}
