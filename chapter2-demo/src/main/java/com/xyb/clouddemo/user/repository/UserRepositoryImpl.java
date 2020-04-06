package com.xyb.clouddemo.user.repository;

import com.xyb.clouddemo.user.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author yebingxu
 */
public class UserRepositoryImpl implements UserRepositoryEx {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<User> findTopUser(int maxResult) {
        Query query = entityManager.createQuery("from User");

        query.setMaxResults(maxResult);
        return query.getResultList();
    }
}
