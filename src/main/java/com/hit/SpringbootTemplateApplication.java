package com.hit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@MapperScan("com.hit.*.mapper")     ////扫描mapper，确保@Autowired注解将Mapper接口注入到其他组件中时，Spring容器能找到该接口的实现类
public class SpringbootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateApplication.class, args);
    }

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }	//密码加密类bean
}
