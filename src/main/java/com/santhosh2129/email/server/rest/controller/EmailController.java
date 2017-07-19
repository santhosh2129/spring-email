package com.santhosh2129.email.server.rest.controller;

import com.santhosh2129.email.server.commons.constants.RabbitMqQueueConstants;
import com.santhosh2129.email.server.rest.entiy.SendEmailEntity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by santhosh on 7/19/17.
 */
@RestController
@CrossOrigin
@RequestMapping("/santhosh2129/email")
public class EmailController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public void registerModule(@RequestBody SendEmailEntity sendEmailEntity) {
        rabbitTemplate.convertAndSend(RabbitMqQueueConstants.EMAIL_SEND_QUEUE,sendEmailEntity);
    }
}
