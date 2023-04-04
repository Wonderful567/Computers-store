package com.xm.store.service.Impl;


import com.xm.store.dao.ProductMapper;
import com.xm.store.pojo.Product;
import com.xm.store.service.IProductService;
import com.xm.store.service.ex.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** 处理商品数据的业务层实现类 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findHotList() {
        List<Product> list = productMapper.findHotList();
        for (Product product : list) {
            product.setPriority(null);
            product.setCreated_user(null);
            product.setCreated_time(null);
            product.setModified_user(null);
            product.setModified_time(null);
        }
        return list;
    }

    @Override
    public Product findById(Integer id) {
        // 根据参数id调用私有方法执行查询，获取商品数据
        Product product = productMapper.findById(id);
        // 判断查询结果是否为null
        if (product == null) {
            // 是：抛出ProductNotFoundException
            throw new ProductNotFoundException("尝试访问的商品数据不存在");
        }
        // 将查询结果中的部分属性设置为null
        product.setPriority(null);
        product.setCreated_user(null);
        product.setCreated_time(null);
        product.setModified_user(null);
        product.setModified_time(null);
        // 返回查询结果
        return product;
    }
}
