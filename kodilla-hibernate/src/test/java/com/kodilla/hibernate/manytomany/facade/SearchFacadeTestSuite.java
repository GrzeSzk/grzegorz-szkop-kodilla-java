package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    Employee johnSmith = new Employee("John", "Smith");
    Company apple = new Company("Apple");

    @BeforeEach
    void beforeEveryTest() {
        apple.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(apple);
    }

    @Test
    void testFindCompanyByPartOfName() {
        try {
            //Given
            companyDao.save(apple);

            //When
            List<Company> companies = searchFacade.findCompanyByPartOfName("app");

            //Then
            assertEquals("Apple", companies.get(0).getName());
        } catch (SearchException e) {
            System.out.println(SearchException.ERROR_COMPANY_NOT_EXISTS);
        } finally {
            //CleanUp
            companyDao.deleteById(apple.getId());
        }
    }

    @Test
    void testFindEmployeeByPartOfName() {
        try {
            //Given
            employeeDao.save(johnSmith);

            //When
            List<Employee> employees = searchFacade.findEmployeeByPartOfName("joh");

            //Then
            assertEquals("John", employees.get(0).getFirstname());
        } catch (SearchException e) {
            System.out.println(SearchException.ERROR_EMPLOYEE_NOT_EXISTS);
        } finally {
            //CleanUp
            employeeDao.deleteById(johnSmith.getId());
        }
    }
}
