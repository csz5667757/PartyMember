package com.assertor.partyMember.controller;

import com.assertor.partyMember.entity.Department;
import com.assertor.partyMember.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/selectAll")
    public List<Department> selectAll() {
        return departmentService.selectAll();
    }

    @PostMapping("/selectone")
    public Department selectById(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.selectById(departmentId);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody Department department) {
        return departmentService.insert(department);
    }

    @PostMapping("/delete")
    public int deleteById(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.deleteById(departmentId);
    }

    @PostMapping("/update")
    public int updateById(@RequestBody Department department){
        return departmentService.uptateById(department);
    }

}
