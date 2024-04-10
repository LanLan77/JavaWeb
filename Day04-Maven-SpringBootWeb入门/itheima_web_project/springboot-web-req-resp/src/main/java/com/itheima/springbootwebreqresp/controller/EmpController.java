package com.itheima.springbootwebreqresp.controller;
import com.itheima.springbootwebreqresp.pojo.Emp;
import com.itheima.springbootwebreqresp.pojo.Result;
import com.itheima.springbootwebreqresp.service.EmpService;
import com.itheima.springbootwebreqresp.service.impl.EmpServiceA;
import com.itheima.springbootwebreqresp.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController
public class EmpController {
    private EmpService empService = new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list(){
        // 1. 调用Service获取数据
        List<Emp> empList = empService.listEmp();
        // 3. 响应数据
        return Result.success(empList);
    }

}



