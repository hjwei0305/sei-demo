package com.changhong.sei.demo.entity;

import com.changhong.sei.core.entity.BaseAuditableEntity;
import com.changhong.sei.demo.flow.BaseFlowEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 流程表单(FlowForm)实体类
 *
 * @author sei
 * @since 2022-04-12 11:02:44
 */
@Entity
@Table(name = "flow_form")
@DynamicInsert
@DynamicUpdate
public class FlowForm extends BaseFlowEntity implements Serializable {
    private static final long serialVersionUID = -44932786812544728L;
    /**
     * 代码
     */
    @Column(name = "code")
    private String code;
    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;
    /**
     * 简称
     */
    @Column(name = "short_name")
    private String shortName;
    /**
     * 组织机构名称
     */
    @Column(name = "organization_name")
    private String organizationName;
    /**
     * 组织机构id
     */
    @Column(name = "organization_id")
    private String organizationId;
    /**
     * 组织机构代码
     */
    @Column(name = "organization_code")
    private String organizationCode;
    /**
     * 租户代码
     */
    @Column(name = "tenant_code")
    private String tenantCode;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

}