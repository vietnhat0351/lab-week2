package com.example.labweek2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
    private Double price;
    private Double quantity;
    private String note;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "product=" + product +
                ", orders=" + orders +
                ", price=" + price +
                ", quantity=" + quantity +
                ", note='" + note + '\'' +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public OrderDetail(Product product, Orders orders, Double price, Double quantity, String note) {
        this.product = product;
        this.orders = orders;
        this.price = price;
        this.quantity = quantity;
        this.note = note;
    }

    public OrderDetail() {
    }
}
