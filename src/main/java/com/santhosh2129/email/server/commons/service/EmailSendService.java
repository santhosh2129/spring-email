package com.santhosh2129.email.server.commons.service;

import com.santhosh2129.email.server.rest.entiy.SendEmailEntity;

/**
 * Created by santhosh on 7/19/17.
 */
public interface EmailSendService {
    public void sendEmail(SendEmailEntity sendEmailEntity);
}
