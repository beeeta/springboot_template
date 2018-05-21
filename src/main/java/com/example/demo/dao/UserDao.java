package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.handlers.EnumTypeHandler;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserSexEnum;

@Mapper
public interface UserDao extends BaseMapper<UserEntity>{
	@Select("SELECT * FROM t_users")
    @Results({
        @Result(property = "userSexEnum",  column = "user_sex", javaType = UserSexEnum.class,typeHandler=EnumTypeHandler.class),
        @Result(property = "userName", column = "user_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM t_users WHERE id = #{id}")
    @Results({
        @Result(property = "userSexEnum",  column = "user_sex", javaType = UserSexEnum.class),
        @Result(property = "userName", column = "user_name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(user_name,user_address,user_sex) VALUES(#{userName}, #{userAddress}, #{userSexEnum})")
    Integer insert(UserEntity user);

    @Update("UPDATE users SET user_name=#{userName},user_address=#{userAddress} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
