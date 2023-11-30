package com.datnguyen.PhishingDetection.Service;

import java.io.IOException;
import java.net.URL;
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
    public String analystFromDataset(String urlToFind) {
        URLEntity analystURL = urlRepo.findURL(urlToFind);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = "";
        try{
            if (urlRepo.URLExisted(analystURL.getUrl())) {
                json = ow.writeValueAsString(analystURL);
            }
        }catch (NullPointerException e){
            Error.URLNotFound();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
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
