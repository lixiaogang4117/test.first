package com.example.demo.service.impl;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.PrivateKey;

/**
 * @Classname ProductServiceImp
 * @Description TODO
 * @Date 2019/3/4 14:35
 * @Author by lierniu
 */
@Service
@Transactional
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Override
    public void tran() {
        //chaxun
        //productMapper.selById(Integer id);
        //删除
        productMapper.del(2);
    }
}
