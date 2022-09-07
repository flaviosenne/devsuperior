package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.properties.TwilioProperties;

import com.devsuperior.dsmeta.repository.SaleRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmsService {

    @Autowired
    private TwilioProperties properties;

    @Autowired
    private SaleRepository saleRepository;

    public void sendSms(Long id){
        Optional<Sale> sale = saleRepository.findById(id);

        if(sale.isPresent()){

            String date = sale.get().getDate().getMonthValue() + "/"+ sale.get().getDate().getYear();

            String msg = new StringBuilder(" O Vendedor ")
                    .append(sale.get().getSellerName())
                    .append(" foi destaque no mês ")
                    .append(date)
                    .append(" com o total de R$")
                    .append(String.format("%.2f",sale.get().getAmount()))
                    .toString();

            Twilio.init(properties.getSid(), properties.getKey());

            PhoneNumber to = new PhoneNumber(properties.getPhoneTo());
            PhoneNumber from = new PhoneNumber(properties.getPhoneFrom());

            Message message = Message.creator(to, from, msg).create();

            System.out.println(message.getSid());
        }
    }
}
