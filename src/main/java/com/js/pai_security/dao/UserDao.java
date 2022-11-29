package com.js.pai_security.dao;

import com.js.pai_security.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User,Integer> {
    public User findByLogin(String login);
}
