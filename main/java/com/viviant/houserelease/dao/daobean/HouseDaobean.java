package com.viviant.houserelease.dao.daobean;

import com.viviant.houserelease.dao.HouseDao;
import com.viviant.houserelease.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by viviant on 16/4/25.
 */
public class HouseDaobean implements HouseDao{

    @Override
    public int saveObject(Object object) {
        Session session = HibernateUtils.getSession();
        Transaction tx = session.beginTransaction();
        try{
            session.save(object);
            tx.commit();
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
            return 2;
        }finally{
            session.close();
        }
    }
}
