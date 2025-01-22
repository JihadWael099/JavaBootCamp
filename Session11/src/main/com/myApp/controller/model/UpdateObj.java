package main.com.myApp.controller.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateObj {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("main/com/myApp/controller/model/hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            int id=4;
            session.beginTransaction();
            Student student=session.get(Student.class, id);
            student.setUsername("gehadsss");
            System.out.println(student);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
