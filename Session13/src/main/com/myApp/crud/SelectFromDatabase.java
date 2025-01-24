package main.com.myApp.crud;

import main.com.myApp.model.Passport;
import main.com.myApp.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class SelectFromDatabase
{
    public static void main(String[] args) {

        SessionFactory sessionFactory =
                new Configuration().configure("hibernate-config.xml")
                        .addAnnotatedClass(Person.class)
                        .addAnnotatedClass(Passport.class)
                        .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();
            Person person = session.get(Person.class, 2);
           // Passport passport = session.get(Passport.class, 2);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
