package example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "example")
@ConfigurationPropertiesScan(basePackages = "example")
public class DemoJasyptLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJasyptLocalApplication.class, args);
    }

}
