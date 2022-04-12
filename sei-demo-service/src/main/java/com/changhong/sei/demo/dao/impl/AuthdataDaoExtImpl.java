package com.changhong.sei.demo.dao.impl;

import com.changhong.sei.core.dao.impl.BaseEntityDaoImpl;
import com.changhong.sei.demo.dao.AuthdataDaoExt;
import com.changhong.sei.demo.entity.Authdata;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * @author liusonglin
 * @version 1.0
 * @Desc
 * @date 22/4/12 9:35
 */
public class AuthdataDaoExtImpl extends BaseEntityDaoImpl<Authdata> implements AuthdataDaoExt {


    private static final String sql = "select * from auth_data where code like ?";

    public AuthdataDaoExtImpl(EntityManager entityManager) {
        super(Authdata.class, entityManager);
    }


    @Override
    public List<Authdata> findListByCode(String code) {
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter(1, "%" + code + "%");
        List realt = query.getResultList();
        return realt;
    }
}
