package com.example.labweek2.enums;

public enum ProductStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);

    final int value;

    ProductStatus(int value) {
        this.value = value;
    }
}
