package com.xxx.salaryemail.controller;

import com.xxx.salaryemail.dao.entity.Staff;
import com.xxx.salaryemail.service.StaffService;
import com.xxx.salaryemail.util.ResponseEntity;
import com.xxx.salaryemail.util.ResponseHelper;
import com.xxx.salaryemail.vo.StaffVO;
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
 * @date 12/23/19 11:04
 */
@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @ApiOperation("get staffs")
    @GetMapping("/api/staffs")
    public ResponseEntity<List<Staff>> getAllStaff(){
        return ResponseHelper.of(staffService.getAll());
    }


    @ApiOperation("change staff email")
    @PatchMapping("/api/staff/{staffId}")
    public ResponseEntity saveStaffEmail(@PathVariable(name = "staffId") Integer staffId,@RequestBody StaffVO staffVO){
        staffService.updateStaffEmail(staffId,staffVO.getEmail());
        return ResponseHelper.ofNothing();
    }

}
