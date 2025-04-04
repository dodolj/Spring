import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Cat {
    private String name;
    private int age;
    private String color;

    public void meow() {
        log.info("Cat {}, {} years, {} says: Meow", name, age, color);
    }
}