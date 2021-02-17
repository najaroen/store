package com.store.store.items;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

@Document(collection = "items")
public class Items {
    @Id
    private String Id;
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("itemPrice")
    private double itemPrice;
    @JsonProperty("itemCategories")
    private String itemCategories;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("updatedAt")
    private Date updatedAt;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategories() {
        return itemCategories;
    }

    public void setItemCategories(String itemCategories) {
        this.itemCategories = itemCategories;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Id='" + Id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemCategories='" + itemCategories + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
