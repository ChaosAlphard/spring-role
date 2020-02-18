package com.ilirus.rolesystem.dao;

import com.ilirus.rolesystem.model.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();
}
