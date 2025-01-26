package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;

import com.adminPanel.app.model.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.mysql.cj.conf.PropertyKey.logger;


@Repository
public class ProductDaoImp implements ProductDao {


    private final SessionFactory sessionFactory;

    @Autowired
    public ProductDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }




    @Override
    @Transactional
    public  List<Product> findAll() {
       Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    @Transactional
    public Product findById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void save(ProductDetails productDetails) {
        Session session = sessionFactory.getCurrentSession();
        session.save(productDetails);
        session.save(new Product(productDetails.getName()));
    }

    @Override
    @Transactional
    public void update(Product product) {

    }

    @Override
    @Transactional
    public void delete(Product product) {

    }
}
