package com.xxx.salaryemail.service.Impl;

import com.xxx.salaryemail.dao.entity.Staff;
import com.xxx.salaryemail.dao.repository.StaffRepository;
import com.xxx.salaryemail.service.StaffService;
import com.xxx.salaryemail.vo.StaffVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 17:53
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }

    @Override
    public void updateStaffEmail(Integer staffId,String email) {
        staffRepository.updateStaffEmail(staffId,email);
    }
}
