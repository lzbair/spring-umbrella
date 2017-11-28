package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication(scanBasePackages = "com.portal.selfecare.services")
class SelfCare {
    void run(String[] args) {
        new SpringApplicationBuilder(getClass())
                .properties("server.port=9000")
                .run(args);
    }
}