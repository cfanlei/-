package club.cfanlei.spring.security.oauth2.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OAuth2ApplicationTest {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Test
    public void getEncodePassword(){
        System.out.print(passwordEncoder.encode("secret"));
    }

}
