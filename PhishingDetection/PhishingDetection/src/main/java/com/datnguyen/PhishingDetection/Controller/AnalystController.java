package com.datnguyen.PhishingDetection.Controller;

import com.datnguyen.PhishingDetection.Service.URLService;
import com.datnguyen.PhishingDetection.Service.WebCrawler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class AnalystController {
    private URLService service;
    public AnalystController(URLService service){
        this.service = service;
    }

    @PostMapping(value ="/analystfromdataset")
    public ResponseEntity<?> analyst(@RequestParam String URL){
        return new ResponseEntity<>(service.analystFromDataset(URL), HttpStatus.OK);
    }

    @PostMapping(value = "/crawlHTML")
    public String HTMLCrawling(@RequestParam String URL) throws IOException {
        return service.getHTML(URL);
    }

    @PostMapping(value = "/crawlJS")
    public String getJS(@RequestParam String URL) throws IOException {
        return new WebCrawler().fetchJsFileContent(URL);
    }

}