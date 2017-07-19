package com.santhosh2129.email.server.commons.service.impl;

import com.santhosh2129.email.server.commons.service.EmailSendService;
import com.santhosh2129.email.server.rest.entiy.SendEmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by santhosh on 7/19/17.
 */
@Service
public class EmailSendServiceImpl implements EmailSendService {
    @Autowired
    private JavaMailSender javaMailSender;


    @Override
    public void sendEmail(SendEmailEntity sendEmailEntity) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(sendEmailEntity.getEmailId());
        message.setText(sendEmailEntity.getMessage());
        javaMailSender.send(message);
    }
}
