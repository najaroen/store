package com.store.store.users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {
    public List<Users> getUsers() {
        return List.of(new Users(1L,"natcharoen", "natcharoen@gmail.com", "0984360421", 21));
    }
}
