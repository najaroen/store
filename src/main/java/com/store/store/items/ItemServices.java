package com.store.store.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.data.mongodb.core.MongoTemplate;

@Service
public class ItemServices {
    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Items> getAllItems() {
        Query query = new Query();
        query.fields().include("itemName", "itemPrice", "itemCategories", "createdAt", "updatedAt", "id");
        List<Items> listItems = mongoTemplate.find(query, Items.class);
        return listItems;
    }

    public void createItem(ItemReqDTO itemReqDTO) {
        Items item = new Items();
        item.setItemPrice(Double.parseDouble(itemReqDTO.getItemPrice()));
        item.setItemName(itemReqDTO.getItemName());
        item.setItemCategories(itemReqDTO.getItemCategories());
        item.setCreatedAt(new Date());
        item.setUpdatedAt(new Date());
        this.mongoTemplate.save(item);
    }
}
