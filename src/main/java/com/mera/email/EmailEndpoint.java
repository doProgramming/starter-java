package com.mera.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailEndpoint {

    @Autowired
    EmailService emailService;

    @PostMapping(value = "/email/send")
    @PreAuthorize("hasRole('ADMIN')")
    public Email sendEmail(@RequestBody Email email){
        return emailService.sendEmail(email);
    }
}
