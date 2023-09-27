package com.example.labweek2.entities;

import jakarta.persistence.*;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String alternative;
    private String path;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                ", product=" + product +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductImage(String alternative, String path, Product product) {
        this.alternative = alternative;
        this.path = path;
        this.product = product;
    }

    public ProductImage() {
    }
}
