package com.store.store.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/items")
public class ItemsController {

    private final ItemServices itemServices;

    @Autowired
    public ItemsController(ItemServices itemServices){
        this.itemServices = itemServices;
    }

    @GetMapping
    public List<Items> getAllItems() {
        return this.itemServices.getAllItems();
    }

    @PostMapping
    public void createItem(@RequestBody ItemReqDTO itemReqDTO) {
        this.itemServices.createItem(itemReqDTO);
    }
}
