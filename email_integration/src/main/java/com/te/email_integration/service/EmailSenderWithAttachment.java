package com.te.email_integration.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderWithAttachment {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMailWithAttachment(String toEmail, String subject, String body, String attachment)
			throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setFrom("anandajay828@gmail.com");
		helper.setTo(toEmail);
		helper.setSubject(subject);
		helper.setText(body);

		FileSystemResource resource = new FileSystemResource(new File(attachment));
		helper.addAttachment(resource.getFilename(), resource);
		javaMailSender.send(message);

		System.out.println("MAil sent with attachment");

	}

	public void sendMultiMailWithAttachment(String[] toEmail, String subject, String body, String attachment)
			throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setFrom("anandajay828@gmail.com");
		helper.setTo(toEmail);
		helper.setSubject(subject);
		helper.setText(body);

		FileSystemResource resource = new FileSystemResource(new File(attachment));
		helper.addAttachment(resource.getFilename(), resource);
		javaMailSender.send(message);

		System.out.println("MAil sent with attachment");

	}

}
