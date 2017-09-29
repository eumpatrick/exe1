package com.example.patrick.listadecompra;

/**
 * Created by Patrick on 29/09/2017.
 */

public class Item {
    private String amount;
    private String name;
    private String category;

    Item(String amount, String name, String category) {
        this.amount = amount;
        this.name = name;
        this.category = category;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
