/* 
User: Urmi
Date: 10/10/2020 
Time: 2:30 PM
*/

package com.first.mybatis.springbootmybatis.mapper;

import com.first.mybatis.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> findAll();

    @Select("select * from users where id=#{id}")
    User findById(int id);
}
