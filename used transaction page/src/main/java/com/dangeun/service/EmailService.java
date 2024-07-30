package com.dangeun.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Log4j2
@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private final Map<String, String> emailToUUID = new HashMap<>();

    public String send_certain_email(String toEmail){
        Random random = new Random();
        String uuid = "" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) +random.nextInt(10);
        emailToUUID.put(toEmail, uuid);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("인증번호 입니다");
        message.setText("인증번호 : " + uuid);
        message.setFrom("67klgg@naver.com");

        javaMailSender.send(message);
        log.info("메일이 전송되었습니다.");
        return uuid;
    }

}
