package com.dajia;

import com.dajia.springboot.consumer.ApplicationMainParent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dengq on 2017/6/8.
 */
@SpringBootApplication
public class ConsumerApplicationMain {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationMainParent.class);
        springApplication.run(args);
    }
}
