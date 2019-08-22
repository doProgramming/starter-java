package com.mera.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    private String sender;
    private String receiver;
    private String body;
    private String subject;
    private String emailTo;
    private String emailFrom;

}
