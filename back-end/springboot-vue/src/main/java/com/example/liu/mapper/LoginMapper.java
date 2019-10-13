package com.example.liu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select * from login where username=#{username} and password = #{password}")
    String LoginIn(@Param("username") String username,@Param("password") String password);
}
