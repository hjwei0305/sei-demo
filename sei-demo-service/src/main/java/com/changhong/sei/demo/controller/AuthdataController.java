package com.changhong.sei.demo.controller;

import com.changhong.sei.core.controller.BaseEntityController;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.dto.serach.PageResult;
import com.changhong.sei.core.dto.serach.Search;
import com.changhong.sei.core.service.BaseEntityService;
import com.changhong.sei.demo.api.AuthdataApi;
import com.changhong.sei.demo.dto.AuthdataDto;
import com.changhong.sei.demo.entity.Authdata;
import com.changhong.sei.demo.service.AuthdataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 权限数据(Authdata)控制类
 *
 * @author sei
 * @since 2022-04-12 09:10:35
 */
@RestController
@Api(value = "AuthdataApi", tags = "权限数据服务")
@RequestMapping(path = AuthdataApi.PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthdataController extends BaseEntityController<Authdata, AuthdataDto> implements AuthdataApi {
    /**
     * 权限数据服务对象
     */
    @Autowired
    private AuthdataService service;

    @Override
    public BaseEntityService<Authdata> getService() {
        return service;
    }

    @Override
    public ResultData<PageResult<AuthdataDto>> findByPage(Search search) {
        return convertToDtoPageResult(service.findByPage(search));
    }


    public ResultData<List<Authdata>> findByCode(String code) {
        return ResultData.success(service.findByCode(code));
    }
}