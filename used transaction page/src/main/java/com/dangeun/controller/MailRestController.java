package com.dangeun.controller;

import com.dangeun.service.EmailService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailRestController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-cert")
    public void sendVerificationEmail(
            HttpSession session,
            @RequestParam String email,
            Model model
    ){
        System.out.println(email);
        String uuid = emailService.send_certain_email(email);
        session.setAttribute("uuid", uuid);
        model.addAttribute("email", email);
    }


    @PostMapping("/success-cert")
    public Boolean verify(
            HttpSession session,
            @RequestParam String uuid
    ) {
        if(session.getAttribute("uuid").equals(uuid)){
            session.setAttribute("successed", true);
            return true;
        }else{
            session.setAttribute("successed", false);
            return false;
        }
    }
}
