package com.example.labweek2.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);

    final int value;

    EmployeeStatus(int value) {
        this.value = value;
    }
}