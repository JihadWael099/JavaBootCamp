package main.com.myApp.controller.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateObj {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("main/com/myApp/controller/model/hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            Student student = new Student("gehad","22222222","gehad@gmai.com");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
