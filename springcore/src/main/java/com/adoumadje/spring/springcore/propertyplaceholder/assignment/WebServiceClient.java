package com.adoumadje.spring.springcore.propertyplaceholder.assignment;

public class WebServiceClient {
    private String url;
    private String client;
    private String password;

    public WebServiceClient(String url, String client, String password) {
        this.url = url;
        this.client = client;
        this.password = password;
    }

    @Override
    public String toString() {
        return "WebServiceClient{" +
                "url='" + url + '\'' +
                ", client='" + client + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
