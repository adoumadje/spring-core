package spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Service service = applicationContext.getBean(Service.class);
        service.create();
        DAO dao = applicationContext.getBean(DAO.class);
        DAO dao1 = applicationContext.getBean(DAO.class);
        System.out.println(dao1.hashCode() == dao.hashCode());
        applicationContext.close();
    }
}
