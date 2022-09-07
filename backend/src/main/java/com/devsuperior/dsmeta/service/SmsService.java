package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.properties.TwilioProperties;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Autowired
    private TwilioProperties properties;

    public void sendSms(){
        Twilio.init(properties.getSid(), properties.getKey());

        PhoneNumber to = new PhoneNumber(properties.getPhoneTo());
        PhoneNumber from = new PhoneNumber(properties.getPhoneFrom());

        Message message = Message.creator(to, from, "teste").create();

        System.out.println(message.getSid());
    }
}
