package com.example.labweek2.entities;

import com.example.labweek2.enums.ProductStatus;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    private String description;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
    private String name;
    private ProductStatus status;
    private String unit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", unit='" + unit + '\'' +
                '}';
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Product(long id, String description, String manufacturerName, String name, ProductStatus status, String unit) {
        this.id = id;
        this.description = description;
        this.manufacturerName = manufacturerName;
        this.name = name;
        this.status = status;
        this.unit = unit;
    }
}
