import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("dev.sabarish.advanced.restApi")
@SpringBootApplication
public class RestApiSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiSpringbootApplication.class, args);
	}

}
