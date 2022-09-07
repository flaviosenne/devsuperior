package com.devsuperior.dsmeta.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "visited_qnt")
    private Integer visitedQnt;

    @Column(name = "deals_qnt")
    private Integer dealsQnt;

    private Double amount;

    private LocalDate date;

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getVisitedQnt() {
        return visitedQnt;
    }

    public void setVisitedQnt(Integer visitedQnt) {
        this.visitedQnt = visitedQnt;
    }

    public Integer getDealsQnt() {
        return dealsQnt;
    }

    public void setDealsQnt(Integer dealsQnt) {
        this.dealsQnt = dealsQnt;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
