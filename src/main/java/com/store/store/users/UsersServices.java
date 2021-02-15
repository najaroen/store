package com.store.store.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Table;
import java.util.List;

@Service
public class UsersServices {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServices(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
}
