package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/project")
public class ProjectController {

    RoleService roleService;
    UserService userService;

    public ProjectController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model){

//        model.addAttribute("user", new UserDTO());
//        model.addAttribute("roles", roleService.findAll());
//        model.addAttribute("users", userService.findAll());

        return "project/create";
    }
}
