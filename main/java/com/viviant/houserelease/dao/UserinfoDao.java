package com.viviant.houserelease.dao;

import com.viviant.houserelease.domain.Userinfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by viviant on 16/4/25.
 */
public interface UserinfoDao {
    /**
     * add one User
     * @param object
     */
    public abstract int saveObject(Object object);

    /**
     * get List
     * @param hql
     * @return
     */
    public <T extends Serializable> List<T> getListForHql(String hql);

    /**
     * get Object from id
     * @param cla
     * @param id
     * @return
     */
    public Object getObjectForId(Class cla,String id);

    /**
     *
     * @param userEmail
     * @return
     */
    public abstract Userinfo getUserinfo(String userEmail);

    /**
     *
     * @param object
     */
    public abstract void update(Object object);
}
