package com.xxx.salary_email;

import com.xxx.salary_email.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalaryEmailApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendMail(){

        String subject="salary";
        String content="你的工资0元";
        String[] to={"2529719324@qq.com","1574124473@qq.com"};
        String[] cc=null;
        String[] bcc = null;
        String[] attachment = null;
        mailService.sendSimpleTextMail(subject,content,to,cc,bcc,attachment);

    }

}
