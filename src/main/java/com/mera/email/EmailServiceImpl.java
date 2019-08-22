package com.mera.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    private final Logger LOG = LoggerFactory.getLogger(EmailServiceImpl.class);
    private JavaMailSender javaMailSender = new JavaMailSenderImpl();

    @Override
    public Email sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getEmailFrom());
        message.setTo(email.getEmailTo());
        message.setSubject(email.getSubject());
        message.setText(email.getBody());
        try{
            javaMailSender.send(message);
            LOG.info("Message is sent to " + email.getEmailTo());
            return email;
        }catch (Exception e){
            LOG.error("Exception while sending email to " + email.getEmailTo());
            return email;
        }
    }
}
