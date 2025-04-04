import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class HelloWorld {
    private String message;
    private int power;

    public void printInfo() {
        log.info("Message: {}, Counter: {}", message, power);
    }
}