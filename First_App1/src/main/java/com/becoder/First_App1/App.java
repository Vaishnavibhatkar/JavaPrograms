package com.becoder.First_App1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started.." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg. buildSessionFactory();
        
        //creating Student
        Student st=new Student();
        st.setId(101);
        st.setName("Vaishnavi");
        st.setCity("Pune");
        System.out.println(st);
        
        Session session = factory.openSession();
     
       Transaction tx=session.beginTransaction();
    
        session.save(st);
        
        tx.commit();
        
        session.close();
        factory.close();
        
      
}

	
	}

