package com.example.labweek2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class ProductPrice {
    @Id
    private Date priceDayTime;
    private String note;
    private Double price;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Override
    public String toString() {
        return "ProductPrice{" +
                "priceDayTime=" + priceDayTime +
                ", note='" + note + '\'' +
                ", price=" + price +
                ", product=" + product +
                '}';
    }

    public Date getPriceDayTime() {
        return priceDayTime;
    }

    public void setPriceDayTime(Date priceDayTime) {
        this.priceDayTime = priceDayTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductPrice(Date priceDayTime, String note, Double price, Product product) {
        this.priceDayTime = priceDayTime;
        this.note = note;
        this.price = price;
        this.product = product;
    }

    public ProductPrice() {
    }
}
