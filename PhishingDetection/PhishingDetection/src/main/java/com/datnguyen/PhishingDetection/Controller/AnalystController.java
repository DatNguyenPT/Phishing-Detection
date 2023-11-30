package com.datnguyen.PhishingDetection.Controller;

import com.datnguyen.PhishingDetection.Service.URLService;
import com.datnguyen.PhishingDetection.Service.WebCrawler;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> analyst(@RequestParam String URL){
        String jsonData = service.analystFromDataset(URL);
        return ResponseEntity.ok(jsonData);
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
