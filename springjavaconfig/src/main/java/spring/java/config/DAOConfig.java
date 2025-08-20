package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DAOConfig {
    @Bean
    @Scope("prototype")
    public DAO dao() {
        return new DAO();
    }
}
