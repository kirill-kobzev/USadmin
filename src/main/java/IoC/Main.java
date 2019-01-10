package IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        User user = context.getBean("user", User.class);
        user.printName("Kirill");
    }
}
