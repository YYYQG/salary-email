package com.xxx.salary_email;

import com.xxx.salary_email.bo.Salary;
import com.xxx.salary_email.service.ExcelService;
import com.xxx.salary_email.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalaryEmailApplicationTests {

    @Autowired
    private MailService mailService;

    @Autowired
    private ExcelService excelService;

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


    @Test
    public void testImport() throws IOException {

        MultipartFile file = new MockMultipartFile("hello",new FileInputStream("/static/salary.xls"));
        List<Salary>  salaries = excelService.excelImport(file);
        System.out.println(salaries.toString());

    }

}
