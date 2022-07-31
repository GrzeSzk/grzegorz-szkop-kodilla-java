package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    public final static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public final CompanyDao companyDao;
    public final EmployeeDao employeeDao;

    @Autowired
    public SearchFacade(final CompanyDao companyDao, final EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByPartOfName (String app) throws SearchException {
        app = '%' + app + '%';
        return companyDao.findCompanyByPartOfName(app);
    }

    public List<Employee> findEmployeeByPartOfName (String joh) throws SearchException {
        joh = '%' + joh + '%';
        return employeeDao.findEmployeeByPartOfName(joh);
    }
}
