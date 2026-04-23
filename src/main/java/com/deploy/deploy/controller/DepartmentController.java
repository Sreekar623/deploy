package com.deploy.deploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping("/getdepartments")
    public String printDetails(){
         return "Departments";
    }




}
