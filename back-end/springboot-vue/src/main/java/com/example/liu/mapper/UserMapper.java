package com.example.liu.mapper;

import com.example.liu.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUser();

    @Insert("insert into user(no,name,email) values(#{no},#{name},#{email})")
    void addUser(User user);

    @Update("update user set name = #{name},email=#{email} where no = #{no}")
    void updateUser(@Param("name")String name,@Param("email") String email,@Param("no") int no);

    @Delete("delete from user where no = #{no}")
    void deleteUser(@Param("no") int no);
}
