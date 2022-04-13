package com.changhong.sei.demo.api;

import com.changhong.sei.core.api.BaseEntityApi;
import com.changhong.sei.core.api.FindByPageApi;
import com.changhong.sei.demo.dto.FlowFormDto;
import org.springframework.cloud.openfeign.FeignClient;

import javax.validation.Valid;

/**
 * 流程表单(FlowForm)API
 *
 * @author sei
 * @since 2022-04-12 11:02:47
 * TODO @FeignClient(name = "请修改为项目服务名")
 */
@Valid
@FeignClient(name = "sei-demo", path = FlowFormApi.PATH)
public interface FlowFormApi extends BaseEntityApi<FlowFormDto>, FindByPageApi<FlowFormDto> {
    String PATH = "flowForm";
}