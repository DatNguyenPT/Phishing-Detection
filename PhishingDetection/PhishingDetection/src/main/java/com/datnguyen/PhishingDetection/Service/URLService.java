package com.datnguyen.PhishingDetection.Service;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.datnguyen.PhishingDetection.Exceptions.Error;
import com.datnguyen.PhishingDetection.Repository.URLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.datnguyen.PhishingDetection.database.URLEntity;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class URLService {
    private URLRepo urlRepo;
    public URLService(URLRepo urlRepo) {
        this.urlRepo = urlRepo;
    }

    public List<URLEntity> list(){
        return urlRepo.getAll();
    }
    public HashMap<String, String>analystFromDataset(String urlToFind) {
        URLEntity analystURL = urlRepo.findURL(urlToFind);
        HashMap<String, String>result = new HashMap<>();
        result.put("URL", analystURL.getUrl());
        result.put("LENGTH",analystURL.getLengthUrl().toString());
        result.put("IP", analystURL.getIp().toString());
        result.put("STATUS", analystURL.getStatus());
        return result;
    }

    public boolean existedCheck(String urlToFind){
        return urlRepo.URLExisted(urlToFind);
    }


    //Web Crawl các loại web, không cần check trong Dataset chứa các Web Phishing
    public String getHTML(String urlToFind) throws IOException {
        return new WebCrawler().getHtmlContent(urlToFind);
    }

    public String getJS(String urlToFind) throws IOException{
        return new WebCrawler().fetchJsFileContent(getJS(urlToFind));
    }
}