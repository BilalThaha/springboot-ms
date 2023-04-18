package com.dailycodebuffer.departmentservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.departmentservice.model.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private List<Department> departments =  new ArrayList<>();
    


}
