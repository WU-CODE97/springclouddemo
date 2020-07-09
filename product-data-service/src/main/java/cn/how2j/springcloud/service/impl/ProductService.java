package cn.how2j.springcloud.service.impl;

import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements cn.how2j.springcloud.service.ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
