import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld bean2 =applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage()==bean2.getMessage());
        Cat bean3 = applicationContext.getBean("cat", Cat.class);
        Cat bean4 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean3.getName()==bean4.getName());

    }
}