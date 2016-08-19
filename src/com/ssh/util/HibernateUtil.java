package com.ssh.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by Administrator on 2016/8/17.
 */
public class HibernateUtil {
    private  static ServiceRegistry serviceRegistry;

    public static SessionFactory createSessionFactory(){
        SessionFactory sessionFactory;
        Configuration cfg = new Configuration();
        cfg.configure();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(
                cfg.getProperties()). buildServiceRegistry();
        sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
