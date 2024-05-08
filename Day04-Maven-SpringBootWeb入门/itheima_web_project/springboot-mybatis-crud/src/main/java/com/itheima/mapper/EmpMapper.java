package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    // 根据ID删除数据
    @Delete("delete from emp where id= #{id}")
    public void delete(Integer id);

    // 新增员工
    @Insert("INSERT INTO emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "VALUES (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, now(), now())")
    public void insert(Emp emp);


    //更新员工
    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}," +
            " job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId},update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);


    //方案三: 开启mybatis的驼峰命名自动映射开关 --- a_cloumn ------> aColumn
    //根据ID查询员工
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    //方案一: 给字段起别名, 让别名与实体类属性一致
    //@Select("select id, username, password, name, gender, image, job, entrydate, " +
    //        "dept_id deptId, create_time createTime, update_time updateTime from emp where id = #{id}")
    //public Emp getById(Integer id);

    //方案二: 通过@Results, @Result注解手动映射封装
    //@Results({
    //        @Result(column = "dept_id", property = "deptId"),
    //        @Result(column = "create_time", property = "createTime"),
    //        @Result(column = "update_time", property = "updateTime")
    //})
    //@Select("select * from emp where id = #{id}")
    //public Emp getById(Integer id);








}
