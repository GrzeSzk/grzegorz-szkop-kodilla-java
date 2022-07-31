package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERROR_COMPANY_NOT_EXISTS = "Company with the given name doesn't exist.";
    public static String ERROR_EMPLOYEE_NOT_EXISTS = "Employee with the given name doesn't exist.";

    public SearchException(String message) {
        super(message);
    }

}
