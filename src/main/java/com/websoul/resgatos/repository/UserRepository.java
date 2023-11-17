package com.websoul.resgatos.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.websoul.resgatos.models.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, Integer> {
    @Query(value = "SELECT * FROM users WHERE email =:email AND password =:password", nativeQuery = true)
    public UserDTO loginValidator(String email, String password);
}
