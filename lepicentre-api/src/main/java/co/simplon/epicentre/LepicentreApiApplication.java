package co.simplon.epicentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // (exclude = SecurityAutoConfiguration.class)
public class LepicentreApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(LepicentreApiApplication.class, args);
    }

}
