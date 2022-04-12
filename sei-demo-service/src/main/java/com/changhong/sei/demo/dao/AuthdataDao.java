package com.changhong.sei.demo.dao;

import com.changhong.sei.core.dao.BaseEntityDao;
import com.changhong.sei.demo.entity.Authdata;
import org.springframework.stereotype.Repository;

/**
 * 权限数据(Authdata)数据库访问类
 *
 * @author sei
 * @since 2022-04-12 09:10:31
 */
@Repository
public interface AuthdataDao extends BaseEntityDao<Authdata>, AuthdataDaoExt {

}