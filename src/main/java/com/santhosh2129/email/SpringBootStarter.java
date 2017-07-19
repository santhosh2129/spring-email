package com.santhosh2129.email;

import com.santhosh2129.email.server.commons.queueprocessor.SendEmailQueuListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
public class SpringBootStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootStarter.class, arg);
    }

    @Bean
    SendEmailQueuListener consumeSendEmailQueus() {
        SendEmailQueuListener sendEmailQueuListener = new SendEmailQueuListener();
        return sendEmailQueuListener;
    }
}
