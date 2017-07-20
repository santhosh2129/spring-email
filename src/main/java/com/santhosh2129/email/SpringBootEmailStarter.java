package com.santhosh2129.email;

import com.santhosh2129.email.server.commons.queueprocessor.SendEmailQueuListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class SpringBootEmailStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootEmailStarter.class, arg);
    }

    @Bean
    SendEmailQueuListener consumeSendEmailQueus() {
        SendEmailQueuListener sendEmailQueuListener = new SendEmailQueuListener();
        return sendEmailQueuListener;
    }
}
