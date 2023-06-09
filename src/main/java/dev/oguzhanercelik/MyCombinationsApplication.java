package dev.oguzhanercelik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class MyCombinationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCombinationsApplication.class, args);
    }

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Turkey"));
    }

}
