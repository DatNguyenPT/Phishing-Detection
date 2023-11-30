package com.datnguyen.PhishingDetection.Service;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

public class WebCrawler {
    public String getHtmlContent(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);

        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(httpGet)) {

            HttpEntity entity = response.getEntity();

            if (entity != null) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()))) {
                    StringBuilder result = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    return result.toString();
                }
            }

        }
        return null;
    }

    public void getJs(String URL){
        Set<String> jsFileUrls = new HashSet<>();

        try {
            // Fetch the HTML content of the website
            Document document = Jsoup.connect(URL).get();

            // Extract all script tags from the HTML
            Elements scriptElements = document.select("script[src]");

            // Extract JavaScript file URLs from script tags
            for (Element scriptElement : scriptElements) {
                String jsFileUrl = scriptElement.attr("abs:src");
                if (jsFileUrl.endsWith(".js")) {
                    jsFileUrls.add(jsFileUrl);
                }
            }

            // Fetch and print the content of each JavaScript file
            for (String jsFileUrl : jsFileUrls) {
                String jsFileContent = fetchJsFileContent(jsFileUrl);
                System.out.println("JavaScript file content for " + jsFileUrl + ":\n" + jsFileContent);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String fetchJsFileContent(String jsFileUrl) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(jsFileUrl, String.class);
    }

}
