package com.cydeo.controller;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/project")
public class ProjectController {

//    RoleService roleService;
    UserService userService;

    ProjectService projectService;

    public ProjectController(ProjectService projectService,UserService userService) {
        this.projectService = projectService;
        this.userService=userService;
    }

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findAll());



        return "/project/create";
    }


    @PostMapping("/create")
    public String insertProject(@ModelAttribute("project")ProjectDTO project){

//@ModelAttribute("user")UserDTO user,
        projectService.save(project);

        System.out.println(project.toString());

        return "redirect:/project/create";
    }
}
