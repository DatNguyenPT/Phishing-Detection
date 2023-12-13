package com.datnguyen.PhishingDetection.Repository;

import com.datnguyen.PhishingDetection.database.DataRetrieval;
import com.datnguyen.PhishingDetection.database.URLEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.datnguyen.PhishingDetection.Entity.URL;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class URLRepo implements JPARepo {

    private URL url;

    public URLRepo(URL url){
        this.url = url;
    }

    // TESTING PURPOSE
    @Override
    public List<URLEntity>getAll(){
        return url.getList();
    }

    // API
    @Override
    public URLEntity findURL(String urlToFind) {
        if (url.getList() != null) {
            for (URLEntity urlEntity : url.getList()) {
                if (urlEntity.getUrl().equals(urlToFind)) {
                    return urlEntity; // No need to create a new instance, return the found entity directly
                }
            }
        }
        return null;
    }


    @Override
    public boolean URLExisted(String urlToFind) {
        if (url != null && url.getList() != null) {
            return url.getList().stream().anyMatch(urlEntity -> urlEntity.getUrl().equals(urlToFind));
        }
        return false;
    }

    @Override
    public String maliciousURL(String urlToFind) {
        if (url != null && url.getList() != null) {
            for (URLEntity urlEntity : url.getList()) {
                if (urlEntity.getUrl().equals(urlToFind)) {
                    if ("phishing".equals(urlEntity.getStatus())) {
                        return "Be Careful !";
                    } else {
                        return "It's good";
                    }
                }
            }
        }
        return "It's good"; // If URL is not found, assume it's safe
    }

    @Override
    public String status(String urlToFind) {
        for (URLEntity urlEntity : url.getList()) {
            if (urlEntity.getUrl().equals(urlToFind)) {
                return urlEntity.getStatus();
            }
        }
        return "No status yet";
    }

    @Override
    public void addURL(URLEntity URL){
        url.getList().add(URL);
    }
}