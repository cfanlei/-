package club.cfanlei.spring.security.oauth2.server.service.impl;

import club.cfanlei.spring.security.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import club.cfanlei.spring.security.oauth2.server.mapper.TbUserMapper;
import club.cfanlei.spring.security.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
     //查询条件
        Example example =new Example(TbUser.class);
        //创建查询条件
        example.createCriteria().andEqualTo(username);
        return tbUserMapper.selectOneByExample(example);
    }
}
