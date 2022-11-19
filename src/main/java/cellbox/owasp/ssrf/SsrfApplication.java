package cellbox.owasp.ssrf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsrfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsrfApplication.class, args);
    }

}
