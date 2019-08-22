package com.mera.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class Email {

    private final Logger LOG = LoggerFactory.getLogger(Email.class);
    private JavaMailSender javaMailSender = new JavaMailSenderImpl();

    public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("asd@yahoo.com");
        msg.setTo("petrovicstrahinja@yahoo.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);
        LOG.debug("Email has been sent");
        LOG.info(((Boolean) LOG.isDebugEnabled()).toString());
    }
}
