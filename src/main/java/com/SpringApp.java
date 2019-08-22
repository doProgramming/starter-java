package com;

import com.mera.email.Email;
import com.mera.email.EmailService;
import com.mera.email.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
		EmailService emailService = new EmailServiceImpl();
		emailService.sendEmail(
				new Email(
						"Spring boot application",
						"Mocked mail server",
						"Dear, \n \n This is being used only for testing purpose for now \n \n Kind Regards,",
						"Testing ",
						"sender-test@mera.com",
						"receiver-test@mera.com"));
	}
}
