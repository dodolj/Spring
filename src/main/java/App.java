import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = context.getBean(HelloWorld.class);
        hello1.setMessage("Abracadabra");
        hello1.setPower(22);
        hello1.printInfo();

        HelloWorld hello2 = context.getBean(HelloWorld.class);
        log.debug("HelloWorld одинаковые? {}", (hello1 == hello2));

        Cat cat1 = context.getBean(Cat.class);
        cat1.setName("Kisa");
        cat1.setAge(3);
        cat1.setColor("white");
        cat1.meow();

        Cat cat2 = context.getBean(Cat.class);
        cat2.setName("Barsik");
        log.debug("Cat одинаковые? {}", (cat1 == cat2));
    }
}