package com.example.sendingemail.controller;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;


import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@RestController

public class EmailController {

    @RequestMapping(value = "/sendemail")
    public String sendEmail() {
        try {
            sendmail();
            return "Email sent successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error sending email";
        }
    }

    private void sendmail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");




}
}

