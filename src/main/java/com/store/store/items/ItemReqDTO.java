package com.store.store.items;

public class ItemReqDTO {
    private String itemName;
    private String itemPrice;
    private String itemCategories;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategories() {
        return itemCategories;
    }

    public void setItemCategories(String itemCategories) {
        this.itemCategories = itemCategories;
    }

    @Override
    public String toString() {
        return "ItemReqDTO{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", itemCategories='" + itemCategories + '\'' +
                '}';
    }
}
