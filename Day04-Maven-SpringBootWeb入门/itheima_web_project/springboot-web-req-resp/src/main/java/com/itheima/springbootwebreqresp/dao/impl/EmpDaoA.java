package com.itheima.springbootwebreqresp.dao.impl;

import com.itheima.springbootwebreqresp.dao.EmpDao;
import com.itheima.springbootwebreqresp.pojo.Emp;
import com.itheima.springbootwebreqresp.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
