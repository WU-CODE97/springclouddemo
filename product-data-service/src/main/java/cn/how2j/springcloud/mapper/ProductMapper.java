package cn.how2j.springcloud.mapper;

import cn.how2j.springcloud.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductMapper {
    @Select("select * from product ")
    List<Product> findAll();

}
