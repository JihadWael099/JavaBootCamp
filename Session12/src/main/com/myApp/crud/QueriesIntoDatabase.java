package main.com.myApp.crud;

import main.com.myApp.model.Product;
import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueriesIntoDatabase {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .configure("hibernate-config.xml")
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();


        List<User> users = session.createQuery("FROM User", User.class).getResultList();
        for (User user : users) {
            System.out.println(user);
        }

     List totel= session.createQuery("select sum(quantity) from Product").getResultList();
     System.out.println(totel);


    }
}