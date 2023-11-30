package com.datnguyen.PhishingDetection.Repository;

import com.datnguyen.PhishingDetection.database.URLEntity;

import java.util.List;

public interface JPARepo {

    List<URLEntity> getAll();
    URLEntity findURL(String urlToFind);
    boolean URLExisted(String urlToFind);
    String maliciousURL(String urlToFind);
    String status(String urlToFind);
}
