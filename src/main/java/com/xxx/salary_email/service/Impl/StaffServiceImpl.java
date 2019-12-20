package com.xxx.salary_email.service.Impl;

import com.xxx.salary_email.dao.entity.Staff;
import com.xxx.salary_email.dao.repository.StaffRepository;
import com.xxx.salary_email.service.StaffService;
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
}
