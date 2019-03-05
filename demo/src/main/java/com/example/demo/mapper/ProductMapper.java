package com.example.demo.mapper;

import com.example.demo.pojo.Products;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;


import java.util.List;


@Mapper
public interface ProductMapper {

    @Insert("insert into products(pname,type,price)values(#{pname},#{type},#{price})")
    public  Integer add(Products products);


    @Delete("delete from products where pid=#{pid} ")
    public Integer del(Integer id);

    @Select("SELECT * FROM products ORDER BY pid DESC")
    public List<Products>  sel();

    @Select("SELECT * FROM products where pid=#{pid}")
    public Products selById(@Param("id") Integer id);

    @Update("UPDATE products SET pname=#{pname},type=#{type},price=#{price},modifyTime=#{modifyTime} " +
            "WHERE " +
            "pid=#{pid}")
    public Integer upd(Products products);
}
