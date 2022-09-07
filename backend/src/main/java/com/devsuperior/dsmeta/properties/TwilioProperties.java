package com.devsuperior.dsmeta.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "twilio")
public class TwilioProperties {

    private String sid;
    private String key;
    private String phoneFrom;
    private String phoneTo;


    public TwilioProperties(String sid, String key, String phoneFrom, String phoneTo) {
        this.sid = sid;
        this.key = key;
        this.phoneFrom = phoneFrom;
        this.phoneTo = phoneTo;
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
