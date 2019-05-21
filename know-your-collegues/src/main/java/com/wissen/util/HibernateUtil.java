package com.wissen.util;





import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.ui.Model;

import com.wissen.model.Employee;
import com.wissen.model.Group;


public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static
    {
        try
        {
//          Configuration configuration = new Configuration();
            Configuration configuration = new Configuration().addAnnotatedClass(Employee.class).addAnnotatedClass(Group.class).configure();
            if(null == sessionFactory)
			{
				serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
						.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

	public static void close() {
		
		if(null != sessionFactory)
		{
			sessionFactory.close();
		}
		
	} 
}