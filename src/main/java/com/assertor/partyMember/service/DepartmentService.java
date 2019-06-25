package com.assertor.partyMember.service;

import com.assertor.partyMember.dao.DepartmentMapper;
import com.assertor.partyMember.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public int insert(Department department){
        return departmentMapper.insert(department);
    }

    public List<Department>  selectAll(){
        return departmentMapper.selectAll();
    }

    public Department selectById(int departmentId){
        return departmentMapper.selectByPrimaryKey(departmentId);
    }

    public int deleteById(int departmentId){
        return departmentMapper.deleteByPrimaryKey(departmentId);
    }

    public int uptateById(Department department){
        return departmentMapper.updateByPrimaryKey(department);
    }
}
