package com.changhong.sei.demo.api;

import com.changhong.sei.core.api.BaseEntityApi;
import com.changhong.sei.core.api.FindByPageApi;
import com.changhong.sei.demo.dto.AuthdataDto;
import org.springframework.cloud.openfeign.FeignClient;

import javax.validation.Valid;

/**
 * 权限数据(Authdata)API
 *
 * @author sei
 * @since 2022-04-12 09:10:38
 * TODO @FeignClient(name = "请修改为项目服务名")
 */
@Valid
@FeignClient(name = "sei-demo", path = AuthdataApi.PATH)
public interface AuthdataApi extends BaseEntityApi<AuthdataDto>, FindByPageApi<AuthdataDto> {
    String PATH = "authdata";
}