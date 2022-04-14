package com.changhong.sei.demo.entity;

import com.changhong.sei.core.dto.annotation.DataHistory;
import com.changhong.sei.core.dto.annotation.EnableDataHistory;
import com.changhong.sei.core.dto.auth.IDataAuthEntity;
import com.changhong.sei.core.entity.BaseAuditableEntity;
import com.changhong.sei.core.entity.IFrozen;
import com.changhong.sei.core.entity.ITenant;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 权限数据(Authdata)实体类
 *
 * @author sei
 * @since 2022-04-12 09:10:11
 */
@Entity
@Table(name = "AuthData")
@DynamicInsert
@DynamicUpdate
@EnableDataHistory(name = "演示数据")
public class Authdata extends BaseAuditableEntity implements Serializable, ITenant, IFrozen, IDataAuthEntity {
    private static final long serialVersionUID = -26707892180019370L;
    /**
     * 代码
     */
    @Column(name = "code")
    private String code;
    /**
     * 名称
     */
    @Column(name = "name")
    @DataHistory(name = "名称")
    private String name;
    /**
     * 名称
     */
    @Column(name = "frozen")
    private Boolean frozen;

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

    @Override
    public Boolean getFrozen() {
        return frozen;
    }

    @Override
    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }
}