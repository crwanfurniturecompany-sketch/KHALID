package com.example.moneycalculator.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "money_entity")
public class MoneyEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String denomination;
    private int quantity;

    public MoneyEntity(String denomination, int quantity) {
        this.denomination = denomination;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}