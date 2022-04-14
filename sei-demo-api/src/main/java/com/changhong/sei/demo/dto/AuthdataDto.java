package com.changhong.sei.demo.dto;

import com.changhong.sei.core.dto.BaseEntityDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * 权限数据(Authdata)DTO类
 *
 * @author sei
 * @since 2022-04-12 09:10:35
 */
@ApiModel(description = "权限数据DTO")
public class AuthdataDto extends BaseEntityDto {
    private static final long serialVersionUID = 947561405338831252L;
    /**
     * 代码
     */
    @ApiModelProperty(value = "代码")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 租户代码
     */
    @ApiModelProperty(value = "租户代码")
    private String tenantCode;


    /**
     * 冻结标志
     */
    @NotNull
    @ApiModelProperty(value = "冻结标志", required = true)
    private Boolean frozen = Boolean.FALSE;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }
}