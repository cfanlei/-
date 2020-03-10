package club.cfanlei.spring.security.oauth2.server.service;

import club.cfanlei.spring.security.oauth2.server.domain.TbUser;

public interface TbUserService{
    TbUser getByUsername(String username);
}
