package main.com.myApp.crud;

import main.com.myApp.model.Passport;
import main.com.myApp.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class CreatePersonANDPassport
{
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate-config.xml")
                        .addAnnotatedClass(Person.class)
                        .addAnnotatedClass(Passport.class)
                        .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            Person person =
                    new Person("mohamed","salah","1990-01-01");

//            Passport passport =
//                    new Passport(person,"5nsdjshdda","1990-01-01");
            session.beginTransaction();
            session.save(person);
//            session.save(passport);

            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
