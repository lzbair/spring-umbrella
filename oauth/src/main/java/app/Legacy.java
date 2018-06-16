package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication(scanBasePackages = "com.portal.selfecare.services")
class Legacy {
    void run(String[] args) {
        new SpringApplicationBuilder(getClass())
                .properties("server.port=8080")
                .run(args);
    }
}