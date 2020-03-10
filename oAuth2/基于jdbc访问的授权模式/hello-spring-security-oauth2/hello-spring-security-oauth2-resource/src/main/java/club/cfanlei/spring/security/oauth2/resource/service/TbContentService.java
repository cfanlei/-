package club.cfanlei.spring.security.oauth2.resource.service;

import club.cfanlei.spring.security.oauth2.resource.domain.TbContent;

import java.util.List;

public interface TbContentService {


    List<TbContent> selectAll();
}
