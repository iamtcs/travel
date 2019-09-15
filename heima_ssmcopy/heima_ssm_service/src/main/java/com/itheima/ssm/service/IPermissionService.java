package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaDialect;

import java.util.List;

public interface IPermissionService {
    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
