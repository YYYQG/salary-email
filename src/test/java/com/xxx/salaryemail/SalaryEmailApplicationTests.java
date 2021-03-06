package com.xxx.salaryemail;

import com.xxx.salaryemail.service.ExcelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalaryEmailApplicationTests {
/*

    @Autowired
    private MailService mailService;
*/

    @Autowired
    private ExcelService excelService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendMail(){

        /*String subject="salary";
        String content="你的工资0元";
        String[] to={"2529719324@qq.com","1574124473@qq.com"};
        String[] cc=null;
        String[] bcc = null;
        String[] attachment = null;
        mailService.sendSimpleTextMail(subject,content,to,cc,bcc,attachment);*/


    }


    @Test
    public void testImport() throws IOException {

        File file = ResourceUtils.getFile("classpath:salary.xls");
        MultipartFile mFile = new MockMultipartFile("salary",new FileInputStream(file));
        excelService.excelImport(mFile);

    }

}
