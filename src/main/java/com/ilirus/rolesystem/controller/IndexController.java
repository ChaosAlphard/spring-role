package com.ilirus.rolesystem.controller;

import com.ilirus.rolesystem.model.User;
import com.ilirus.rolesystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    private UserService us;

    @RequestMapping(value = {"/", "index"})
    public String Index(Model model) {
        List<User> all = us.getAll();
        model.addAttribute("userlist", all);
        return "index";
    }
}
