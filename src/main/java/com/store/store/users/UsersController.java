package com.store.store.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class UsersController {

    private final UsersServices usersServices;

    @Autowired
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }
    @GetMapping
    public List<Users> getUsers() {
        return usersServices.getUsers();
    }

    @PostMapping
    public void createUserCustomer(@RequestBody Users users) {
        usersServices.createUserCustomer(users);
    }

    @DeleteMapping(path = "{UserId}")
    public void deleteUserCustomer(@PathVariable("UserId") Long id){
            System.out.println(id);
            usersServices.deleteUserCustomer(id);
    }
}
