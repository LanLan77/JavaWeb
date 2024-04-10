package com.itheima.springbootwebreqresp.controller;

import com.itheima.springbootwebreqresp.pojo.Address;
import com.itheima.springbootwebreqresp.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试响应数据
 *
 */

@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("helloworld");
        //return new Result(1,"success","helloworld");
        return Result.success("helloworld");
    }

    /**
     * @responsebody 会将json转换成对象
     * @return
     */
    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address address = new Address();
        address.setPrivance("广东");
        address.setCity("深圳");
        return Result.success(address);
    }


    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<String> list = new ArrayList<>();
        Address address = new Address();
        address.setPrivance("广东");
        address.setCity("深圳");

        Address address2 = new Address();
        address2.setPrivance("山东");
        address2.setCity("潍坊");

        list.add(String.valueOf(address));
        list.add(String.valueOf(address2));
        return Result.success();
    }
}
