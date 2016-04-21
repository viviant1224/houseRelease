package com.viviant.houserelease.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: viviant
 * Date: 15-4-30
 * Time: 下午4:37
 * To change this template use File | Settings | File Templates.
 */
public class HibernateUtils {
    private static Configuration configuration;

    private static SessionFactory sessionFactory;
    //设计模式 单例模式
    static{
        configuration = new Configuration();

        configuration.configure();

        sessionFactory = configuration.buildSessionFactory();//爷爷活干完了
    }

    public static Session getSession(){

        try{

            Session session = sessionFactory == null ? null : sessionFactory.openSession();

            return session;

        }catch(Exception e){

            e.printStackTrace();

            return null;
        }
    }
}
