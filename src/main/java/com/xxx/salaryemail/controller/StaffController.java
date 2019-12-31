package com.xxx.salaryemail.controller;

import com.xxx.salaryemail.dao.entity.Staff;
import com.xxx.salaryemail.service.StaffService;
import com.xxx.salaryemail.util.ResponseEntity;
import com.xxx.salaryemail.util.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/23/19 11:04
 */
@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;


    @GetMapping("/staffs")
    public ResponseEntity<List<Staff>> getAllStaff(){
        return ResponseHelper.of(staffService.getAll());
    }

}
