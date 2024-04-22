package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    // 根据ID删除数据
    @Delete("delete from emp where id= #{id }")
    public void delete(Integer id);

    // 新增员工
    @Insert("INSERT INTO emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "VALUES (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, now(), now())")
    public void insert(Emp emp);
}
