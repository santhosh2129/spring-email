package com.santhosh2129.email.server.rest.entiy;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by santhosh on 7/19/17.
 */
@Data
@Getter
public class SendEmailEntity implements Serializable {

    private String emailId;

    private String message;


}
