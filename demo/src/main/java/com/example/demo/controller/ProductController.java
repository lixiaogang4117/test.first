package com.example.demo.controller;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.pojo.Products;
import com.example.demo.service.ProductService;
import com.example.demo.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2018/10/31
 */
@RestController
@Api(value = "一个用来测试swagger注解的控制器")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/lee/add")
    @ApiOperation(value="新增",notes = "test:仅1一个返回")
    public  Object add(@RequestBody Products products){
        products.setCreateTime(new Date().toString());
        Integer integer=productMapper.add(products);
        return integer==1?new Response(200,"OK"):new Response(500,"FAIL");
    }

    @DeleteMapping("/lee/del/{id}")
    @ApiOperation(value = "删除",notes = "返回")
    public Object del(@PathVariable("id")@RequestBody Integer id){
        //Integer integer=productService.del(id);
        productService.tran();
        //return integer==1?new Response(200,"OK"):new Response(500,"FAIL");
        return "success";
    }
    @GetMapping("/lee/sell")
    @ApiOperation(value = "查",notes = "")
    public Object sel(){
        List<Products> products =productMapper.sel();

        return products==null?new Response(500,"FAIL",products):
                new Response(200,"OK",products);
    }

    @GetMapping("/lee/sel/{id}")
    @ApiOperation(value = "查一个",notes = "")
    public Object sell(@PathVariable("id")Integer id){
        Products products=productMapper.selById(id);

        return products==null?new Response(500,"查无此人",products):new Response(200,
                "ok",products);
    }
    @PostMapping("/lee/upd")
    @ApiOperation(value = "修改",notes = "")
    public Object upd(Products products){
        products.setCreateTime(new Date().toString());
        Integer  integer=productMapper.upd(products);
        Products products1=productMapper.selById(products.getPid());
        return integer==1?new Response(200,"OK",products1):
                new Response(500,"FAIL");
    }
}
