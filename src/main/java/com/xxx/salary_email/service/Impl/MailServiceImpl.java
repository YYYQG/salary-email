///*
//package com.xxx.salary_email.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.ArrayUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//import org.thymeleaf.TemplateEngine;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//import java.util.stream.Stream;
//
//@Service
//@Slf4j
//public class MailService {
//
//    @Value("$spring.mail.username")
//    private String userName;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//
//    public void sendSimpleTextMail(String subject,String content,String[] to,String[] cc,String[] bcc,String[] attachments){
//
//        log.info("开始发送简单文本邮件：主题->{}，收件人->{}，抄送人->{}，密送人->{}，附件->{}",subject,to,cc,bcc,attachments);
//
//        if(ArrayUtils.isNotEmpty(attachments)){
//
//            try {
//                MimeMessage mimeMessage = mailSender.createMimeMessage();
//                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
//                handleBasicInfo(helper,subject,content,to,cc,bcc,false);
//                handelAttachments(helper,attachments);
//                mailSender.send(mimeMessage);
//            } catch (MessagingException e) {
//                e.printStackTrace();
//            }
//
//        }else {
//
//            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//            handleBasicInfo(simpleMailMessage,subject,content,to,cc,bcc);
//            mailSender.send(simpleMailMessage);
//
//        }
//
//    }
//
//    private void handelAttachments(MimeMessageHelper helper, String[] attachments) {
//
//        if(ArrayUtils.isNotEmpty(attachments)){
//
//            Stream.of(attachments).forEach((attachment)->{
//
//                FileSystemResource resource = new FileSystemResource(new File(attachment));
//                if(resource.exists()){
//                    try {
//                        String fileName = resource.getFilename();
//                        helper.addAttachment(fileName,resource);
//                    } catch (MessagingException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            });
//
//        }
//
//    }
//
//    private void handleBasicInfo(SimpleMailMessage simpleMailMessage,String subject,String content,String[] to,String[] cc,String[] bcc){
//
//        simpleMailMessage.setFrom(userName);
//        simpleMailMessage.setSubject(subject);
//        simpleMailMessage.setText(content);
//        simpleMailMessage.setTo(to);
//        simpleMailMessage.setCc(cc);
//        simpleMailMessage.setBcc(bcc);
//
//    }
//
//    private void handleBasicInfo(MimeMessageHelper helper,String subject,String content,String[] to,String[] cc,String[] bcc,boolean isHtml){
//
//        try {
//
//            helper.setFrom(userName);
//            helper.setSubject(subject);
//            helper.setText(content,isHtml);
//            helper.setTo(to);
//
//            if(ArrayUtils.isNotEmpty(cc)){
//                helper.setCc(cc);
//            }
//            if(ArrayUtils.isNotEmpty(bcc)){
//                helper.setBcc(bcc);
//            }
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//}
//*/
