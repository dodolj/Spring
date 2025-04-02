import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = context.getBean(HelloWorld.class);
        HelloWorld hello2 = context.getBean(HelloWorld.class);

        Cat cat1 = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);

        System.out.println("HelloWorld одинаковые? " + (hello1 == hello2));
        System.out.println("Cat одинаковые? " + (cat1 == cat2));
    }
}