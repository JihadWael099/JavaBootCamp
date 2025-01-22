package main.com.myApp.crud;

import main.com.myApp.model.Product;
import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDatabase {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .configure("hibernate-config.xml")
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.createQuery("update Product set price= :price , name= :name , description=:description, quantity=:quantity where id= :id")
                .setParameter("price", 100)
                .setParameter("name", "Product61")
                .setParameter("quantity", 1111)
                .setParameter("description", "Product 61 description")
                .setParameter("id", 23)
                .executeUpdate();
        session.getTransaction().commit();
    }
}
