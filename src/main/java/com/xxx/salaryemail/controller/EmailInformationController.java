package com.xxx.salaryemail.controller;

import com.xxx.salaryemail.bo.EmailInformationBO;
import com.xxx.salaryemail.service.EmailInformationService;
import com.xxx.salaryemail.service.StaffService;
import com.xxx.salaryemail.util.ResponseEntity;
import com.xxx.salaryemail.util.ResponseHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 01/03/20 13:37
 */

@RestController
public class EmailInformationController {

    @Autowired
    private EmailInformationService emailInformationService;

    @Autowired
    private StaffService staffService;

    @GetMapping("/api/email/informations")
    public ResponseEntity getAll(){
        List<EmailInformationBO> emailInformations = emailInformationService.getAll();
        return ResponseHelper.of(emailInformations);
    }

    @ApiOperation("")
    @PatchMapping("/api/email/informations/{staffId}")
    public ResponseEntity updateEmailInformation(@PathVariable("staffId") Integer staffId, @RequestBody EmailInformationBO emailInformationBO){
        staffService.updateStaffEmail(staffId,emailInformationBO.getEmail());
        emailInformationBO.setStaffId(staffId);
        emailInformationService.updateEmailInformation(emailInformationBO);
        return ResponseHelper.ofNothing();
    }

}
