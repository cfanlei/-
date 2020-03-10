package club.cfanlei.spring.security.oauth2.resource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TbUser implements Serializable {
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码，加密存储
    */
    private String password;

    /**
    * 注册手机号
    */
    private String phone;

    /**
    * 注册邮箱
    */
    private String email;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;
}