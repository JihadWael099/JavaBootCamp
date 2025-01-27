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

        Product product = productDetails.getProduct();
        if (product == null) {
            product = new Product(productDetails.getName());
            productDetails.setProduct(product);
        }
        session.save(product);
        session.save(productDetails);
    }

    @Override
    @Transactional
    public void update(ProductDetails productDetails) {
        if (productDetails == null || productDetails.getProduct() == null) {
            throw new IllegalArgumentException("ProductDetails or Product cannot be null");
        }

        Session session = sessionFactory.getCurrentSession();
        Product product = productDetails.getProduct();
        if (product == null) {
            product = new Product(productDetails.getName());
            productDetails.setProduct(product);
        }
        session.saveOrUpdate(product);
        session.saveOrUpdate(productDetails);
    }


    @Override
    @Transactional
    public Product getProductById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product getProduct=session.get(Product.class, id);
        return getProduct;
    }

    @Override
    @Transactional
    public void delete(int id ) {
        Session session = sessionFactory.getCurrentSession();
        Product getProduct=getProductById(id);
        if(getProduct.getProductDetails()!=null ){
            session.delete(getProduct.getProductDetails());
        }
        session.delete(getProduct);
    }
}
