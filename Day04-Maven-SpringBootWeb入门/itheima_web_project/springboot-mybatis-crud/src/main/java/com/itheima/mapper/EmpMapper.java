package com.itheima.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    // 根据ID删除数据
    @Delete("delete from emp where id= #{id }")
    public void delete(Integer id);
}
