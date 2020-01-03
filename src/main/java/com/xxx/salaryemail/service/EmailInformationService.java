package com.xxx.salaryemail.service;

import com.xxx.salaryemail.bo.EmailInformationBO;
import com.xxx.salaryemail.dao.entity.EmailInformation;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 01/03/20 13:48
 */
public interface EmailInformationService {

    List<EmailInformationBO> getAll();

}
