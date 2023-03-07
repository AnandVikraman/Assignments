package com.te.email_integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.email_integration.service.EmailSenderService;
import com.te.email_integration.service.EmailSenderWithAttachment;

import jakarta.mail.MessagingException;

@RestController
public class Controller {

	@Autowired
	private EmailSenderWithAttachment attachment;

	@Autowired
	private EmailSenderService senderService;

	@GetMapping("/sendMail")
	public ResponseEntity<?> sendEmailWithAttachment() throws MessagingException {
		attachment.sendMailWithAttachment("shrimanvinoth@gmail.com", "photo", "Boot Email Integration",
				"C:\\Users\\Acer\\Desktop\\77572.png");
		return new ResponseEntity<String>("Email Sent", HttpStatus.OK);

	}
	
	@GetMapping("/sendMultiMail")
	public ResponseEntity<?> sendMultiEmailWithAttachment() throws MessagingException {
		String [] emailMulti= {"sathishenfield1996@gmail.com", "jaganathan1000bc@gmail.com",
				"shrimanvinoth@gmail.com"};
		attachment.sendMultiMailWithAttachment(emailMulti, "photo", "Boot Email Integration",
				"C:\\Users\\Acer\\Desktop\\77572.png");
		return new ResponseEntity<String>("Email Sent", HttpStatus.OK);

	}

	@GetMapping("/sendGmail")
	public ResponseEntity<?> sendEmail() {
		senderService.sendMail("jaganathan1000bc@gmail.com", "Email Integration", "Hi Java Jagan");
		return new ResponseEntity<String>("Email sent", HttpStatus.OK);
	}

}
