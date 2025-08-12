package com.adoumadje.springorm.course.dao;

import com.adoumadje.springorm.course.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component("productDAO")
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public void create(Product product) {
        hibernateTemplate.save(product);
    }

    @Transactional
    @Override
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Transactional
    @Override
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Transactional
    @Override
    public Product find(int id) {
        return hibernateTemplate.get(Product.class, id);
    }

    @Transactional
    @Override
    public List<Product> findAll() {
        return hibernateTemplate.loadAll(Product.class);
    }
}
