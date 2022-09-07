package com.devsuperior.dsmeta.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class TwilioProperties {

    @Value("${twilio.sid}")
    private String sid;

    @Value("${twilio.key}")
    private String key;

    @Value("${twilio.phoneFrom}")
    private String phoneFrom;

    @Value("${twilio.phoneTo}")
    private String phoneTo;


    public TwilioProperties(String sid, String key, String phoneFrom, String phoneTo) {
        this.sid = sid;
        this.key = key;
        this.phoneFrom = phoneFrom;
        this.phoneTo = phoneTo;
    }

    public TwilioProperties(){

    }


    public String getSid() {
        return sid;
    }

    public String getKey() {
        return key;
    }

    public String getPhoneFrom() {
        return phoneFrom;
    }

    public String getPhoneTo() {
        return phoneTo;
    }
}
