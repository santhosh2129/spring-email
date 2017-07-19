package com.santhosh2129.email.server.commons.queueprocessor;

import com.santhosh2129.email.server.commons.constants.RabbitMqQueueConstants;
import com.santhosh2129.email.server.commons.service.EmailSendService;
import com.santhosh2129.email.server.rest.entiy.SendEmailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by santhosh on 7/19/17.
 */
@RabbitListener(queues = RabbitMqQueueConstants.EMAIL_SEND_QUEUE)
public class SendEmailQueuListener {
    Logger logger = LoggerFactory.getLogger(SendEmailQueuListener.class);

    @Autowired
    private EmailSendService emailSendService;

    @RabbitHandler
    public void listenSendEmailQueue(SendEmailEntity sendEmailEntity){
        emailSendService.sendEmail(sendEmailEntity);
    }
}
