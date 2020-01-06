package com.xxx.salaryemail.service.Impl;

import com.xxx.salaryemail.bo.EmailInformationBO;
import com.xxx.salaryemail.dao.entity.EmailInformation;
import com.xxx.salaryemail.dao.repository.EmailInformationRepository;
import com.xxx.salaryemail.service.EmailInformationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 01/03/20 13:49
 */

@Service
public class EmailInformationServiceImpl implements EmailInformationService {

    @Autowired
    private EmailInformationRepository emailInformationRepository;

    @Override
    public List<EmailInformationBO> getAll() {

        List<EmailInformation> emailInformations = emailInformationRepository.findAll();
        List<EmailInformationBO> emailInformationBOs = emailInformations.stream()
                .map(emailInformation -> {
                    EmailInformationBO emailInformationBO = new EmailInformationBO();
                    BeanUtils.copyProperties(emailInformation,emailInformationBO);
                    emailInformationBO.setStaffName(emailInformation.getStaff().getName());
                    emailInformationBO.setEmail(emailInformation.getStaff().getEmail());
                    return emailInformationBO;
                })
                .collect(Collectors.toList());
        return emailInformationBOs;

    }

    @Override
    public void updateEmailInformation(EmailInformationBO emailInformationBO) {
        emailInformationRepository.updateEmailInformation(emailInformationBO);
    }
}
