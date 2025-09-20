package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Saloni");
//        s1.setRoll(19);
//        s1.setSage(35);
//        Student s2 = null;
        Laptop l1 =  new Laptop();
        l1.setLid(01);
        l1.setBrand("Lenovo");
        l1.setRam(16);
        l1.setModel("ThinkPad");
        Laptop l2 =  new Laptop();
        l2.setLid(02);
        l2.setBrand("Lenovo");
        l2.setRam(8);
        l2.setModel("Yoga");
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Ashish");
        a1.setTech("Java");
        a1.setLaptop(l1);

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Ravi");
        a2.setTech("SAnskrit");
        a2.setLaptop(l2);


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        //cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx= session.beginTransaction(); // only when we are doing some manipulation in database
        session.persist(l1);
        session.persist(a1);// to save changes in database
        session.persist(a2);
        session.persist(l2);

//            session.merge(s1);
//        s1= session.find(Student.class,29);
//         s2=session.find(Student.class,19);
//        session.remove(s1);
        Alien a3= session.find(Alien.class,101);

                tx.commit();
        session.close();
        sf.close();
        System.out.println(a3);

    }
}