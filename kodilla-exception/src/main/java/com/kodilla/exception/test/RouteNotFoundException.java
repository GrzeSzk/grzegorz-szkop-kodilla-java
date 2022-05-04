package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    public RouteNotFoundException(){
        super("Error occured: There is no such airport");
    }


}
