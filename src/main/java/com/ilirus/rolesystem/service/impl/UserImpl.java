package com.ilirus.rolesystem.service.impl;

import com.ilirus.rolesystem.dao.UserDao;
import com.ilirus.rolesystem.model.User;
import com.ilirus.rolesystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserImpl implements UserService {
    @Resource
    private UserDao ud;

    @Override
    public List<User> getAll() {
        return ud.queryAll();
    }
}
