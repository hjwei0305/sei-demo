package com.changhong.sei.demo.dto.flow;

import com.changhong.sei.core.dto.BaseEntityDto;
import com.changhong.sei.core.dto.flow.FlowStatus;
import com.changhong.sei.core.dto.serializer.EnumJsonSerializer;
import com.changhong.sei.util.DateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author liusonglin
 * @version 1.0
 * @Desc
 * @date 2021/9/17 16:19
 */
public class BaseFlowDto extends BaseEntityDto {

    @ApiModelProperty(value = "流程状态")
    @JsonSerialize(using = EnumJsonSerializer.class)
    private FlowStatus flowStatus = FlowStatus.INIT;

    @ApiModelProperty(value = "组织机构名字")
    private String organizationName;

    @ApiModelProperty(value = "组织机构代码")
    private String organizationCode;

    @ApiModelProperty(name = "组织机构id")
    private String organizationId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = DateUtils.DEFAULT_TIME_FORMAT)
    @JsonFormat(timezone = DateUtils.DEFAULT_TIMEZONE, pattern = DateUtils.DEFAULT_TIME_FORMAT)
    private Date createdDate;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String creatorName;


    public FlowStatus getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(FlowStatus flowStatus) {
        this.flowStatus = flowStatus;
    }


    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
