package com.xxx.salaryemail.service;

import com.xxx.salaryemail.dao.entity.Staff;
import com.xxx.salaryemail.vo.StaffVO;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 17:52
 */
public interface StaffService {

    List<Staff> getAll();

    void updateStaffEmail(Integer staffId,String email);

}
