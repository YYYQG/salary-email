package com.xxx.salary_email.dao.repository;

import com.xxx.salary_email.dao.entity.Staff;

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
