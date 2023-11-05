package com.learning.springboot.learnspringboot;

//currency-service.URL
//currency-service.Username
//currency-service.Key

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*@ConfigurationProperties - used to bind external properties to a java bean*/
@ConfigurationProperties(prefix = "currency-service")
/*@Component Annotation - by annotating a class with @component, we're telling the spring framework that an instance of this class should be kept in the ApplicationContext*/
@Component
public class CurrencyServiceConfiguration {
    private String URL;
    private String Username;
    private String Key;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }
}
