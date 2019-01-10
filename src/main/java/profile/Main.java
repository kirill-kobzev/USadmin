package profile;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("develop");
        context.load("classpath*:profileContext.xml");
        context.refresh();
        Animal bean = context.getBean(Animal.class);
        bean.ssy();
    }
}
