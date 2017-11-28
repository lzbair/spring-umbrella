package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication(scanBasePackages = "com.portal.authorization.services")
class OAuth2 {
    void run(String[] args) {
        new SpringApplicationBuilder(getClass())
                .properties("server.port=9001")
                .run(args);
    }
} 