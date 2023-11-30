package com.datnguyen.PhishingDetection.Entity;

import com.datnguyen.PhishingDetection.database.DataRetrieval;
import com.datnguyen.PhishingDetection.database.URLEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class URL {
    private List<URLEntity> list;
    DataRetrieval data = new DataRetrieval();

    public URL(){
        list = data.getData();
    }

    public URL(List<URLEntity> list) {
        this.list = list;
    }

    public List<URLEntity> getList() {
        return this.list;
    }

    public void setList(List<URLEntity> list) {
        this.list = list;
    }
}

