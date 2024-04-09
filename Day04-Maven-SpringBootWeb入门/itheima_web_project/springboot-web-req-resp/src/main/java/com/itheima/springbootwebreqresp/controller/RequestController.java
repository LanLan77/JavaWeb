package com.itheima.springbootwebreqresp.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.itheima.springbootwebreqresp.pojo.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/*1. 原始方式获取请求参数
        * ﻿﻿controller方法形参中声明HttpServletRequest对象
        * ﻿调用对象的getParameter(参数名）
        2. SpringBoot中接收简单参数
        * ﻿请求参数名与方法形参变量名相同
        * ﻿会自动进行类型转换
        3. @RequestParam注解
* ﻿方法形参名称与请求参数名称不匹配，通过该注解完成映射
        * ﻿该注解的required属性默认是true，代表请求参数必须传递*/


/**
 * 测试请求参数接收
 */
@RestController
public class RequestController {
    // 原始方式：在原始的web程序中，获取请求参数，需要通过HttpServletRequest对象手动获取
    // 缺点：繁琐，需要手动类型转换
    // 指定请求路径
    /*@RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request) {
        // 获取请求参数
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        // 检查ageStr是否为null或空
        if (ageStr == null || ageStr.trim().isEmpty()) {
            return "Age parameter is missing or invalid";
        }

        // 安全地转换ageStr为整数
        int age;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            return "Invalid age format";
        }

        System.out.println("Name: " + name + " Age: " + age);
        return "OK ";
    }*/

    // Springboot 方式接收
    /*@RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age) { //springboot进行自动类型转换
        System.out.println("Name: " + name + " Age: " + age);
        return "OK ";
    }*/


    /**
     *
     * @param userName
     * @param age
     * @return
     *
     * Springboot 方式
     * 简单参数：如果方法形参名称与请求参数名称不一致，可以使用RequestParam的方式完成映射
     *
     * 注意事项
     * • @RequestParam中的required属性默认为true，代表该请求参数必须传递，
     *   如果不传递将报错。如果该参数是可选的，可以将required属性设置为false。
     */
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(value="name", required = false) String userName, Integer age) { //springboot进行自动类型转换
        System.out.println("Name: " + userName + " Age: " + age);
        return "OK ";
    }

    /**
     *  简单实体对象：请求数据名与形参对象数据名相同，定义POJO接收即可
     *
     * @param user
     * @return
     */
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "simplePojo OK ";
    }


    /**
     *  复杂实体对象：请求数据名与形参对象数据名相同，定义POJO接收即可
     *
     * @param user
     * @return
     */
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "complexPojo OK ";
    }


    /**
     *  数组参数
     *  数组参数：请求参数名与形参数组名称相同且请求参数为多个，定义数组类型形参即可接收参数
     *
     * @param hobby
     * @return
     */
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "arrayParam OK ";
    }


    /**
     *  集合参数
     *  集合参数：请求参数名与形参数组名称相同且请求参数为多个，定义集合类型形参即可接收参数
     *
     * @param hobby
     * @return
     */
    @RequestMapping("/listParam")
    public String listParam(@RequestParam(value = "hobby", required = false) List<String> hobby){
        System.out.println(hobby);
        return "listParam OK ";
    }


    /**
     *  时间参数
     *  时间参数：使用@DateTimeFormat注解完成日期参数格式转换
     *
     * @param /dateParam
     * @return
     */
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return "date OK ";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "jsonParam Ok";
    }

}