package club.cfanlei.spring.security.oauth2.server.service;

import club.cfanlei.spring.security.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectByUserId(Long id);
}
