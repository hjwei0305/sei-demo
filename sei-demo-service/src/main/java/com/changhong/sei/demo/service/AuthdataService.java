package com.changhong.sei.demo.service;

import com.changhong.sei.core.dao.BaseEntityDao;
import com.changhong.sei.core.dto.serach.PageResult;
import com.changhong.sei.core.dto.serach.Search;
import com.changhong.sei.core.service.BaseEntityService;
import com.changhong.sei.core.service.bo.OperateResultWithData;
import com.changhong.sei.demo.dao.AuthdataDao;
import com.changhong.sei.demo.entity.Authdata;
import com.changhong.sei.serial.sdk.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 权限数据(Authdata)业务逻辑实现类
 *
 * @author sei
 * @since 2022-04-12 09:10:34
 */
@Service
public class AuthdataService extends BaseEntityService<Authdata> {
    @Autowired
    private AuthdataDao dao;

    @Autowired(required = false)
    private SerialService serialService;

    @Override
    protected BaseEntityDao<Authdata> getDao() {
        return dao;
    }

    @Override
    public PageResult<Authdata> findByPage(Search searchConfig) {
        return super.findByPage(searchConfig);
    }

    @Override
    protected OperateResultWithData<Authdata> preInsert(Authdata entity) {
        entity.setCode(serialService.getNumber(entity.getClass()));
        return super.preInsert(entity);
    }

    public List<Authdata> findByCode(String code){
        return dao.findListByCode(code);
    }
}