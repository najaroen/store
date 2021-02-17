package com.store.store.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public void createUserCustomer(Users users) {
        Optional<Users> usersByEmail = usersRepository.findUsersByEmail(users.getEmail());
        if(usersByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        System.out.println(users);
        usersRepository.save(users);
    }

    public void deleteUserCustomer(Long id) {
        boolean UserCustomer = usersRepository.existsById(id);
        if(!UserCustomer) {
            throw new IllegalStateException("Customer id"+ id + " dose not exit");
        }
        usersRepository.deleteById(id);
    }
}
