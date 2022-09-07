package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable){

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = "".equals(minDate) ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = "".equals(maxDate) ? today : LocalDate.parse(maxDate);

        return this.repository.findSales(min, max, pageable);
    }
}
