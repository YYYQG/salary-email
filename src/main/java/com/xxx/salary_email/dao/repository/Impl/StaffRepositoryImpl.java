package com.xxx.salary_email.dao.repository.Impl;

import com.xxx.salary_email.dao.entity.Staff;
import com.xxx.salary_email.dao.repository.StaffRepositoryCustom;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 15:53
 */
public class StaffRepositoryImpl implements StaffRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void update(Staff staff) {

        /*StringBuilder sql = new StringBuilder();
        sql.append("update Staff set idCard = : idCard,name = :name,department = :department,sex = :sex,education = :education, ")
                .append("depositBank = :depositBank,bankAccount = :bankAccount,entryDate = :entryDate,telephone = :telephone,salary = :salary,")
                .append("remark = :remark where id = :id");
        Query query = entityManager.createQuery(sql.toString());
        query.setParameter("idCard",staff.getIdCard());
        query.setParameter("name",staff.getName());
        query.setParameter("department",staff.getDepartment());
        query.setParameter("sex",staff.getSex());
        query.setParameter("education",staff.getEducation());
        query.setParameter("depositBank",staff.getDepositBank());
        query.setParameter("bankAccount",staff.getBankAccount());
        query.setParameter("entryDate",staff.getEntryDate());
        query.setParameter("telephone",staff.getTelephone());
        query.setParameter("salary",staff.getSalary());
        query.setParameter("remark",staff.getRemark());
        query.setParameter("id",staff.getId());
        query.executeUpdate();*/
        entityManager.merge(staff);
    }

    @Override
    @Transactional
    public Staff insert(Staff staff) {
        entityManager.persist(staff);
        return staff;
    }
}
