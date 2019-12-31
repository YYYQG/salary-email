package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.dao.entity.Staff;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 16:24
 */
public interface StaffRepositoryCustom {

    void update(Staff staff);

    Staff insert(Staff staff);

}
