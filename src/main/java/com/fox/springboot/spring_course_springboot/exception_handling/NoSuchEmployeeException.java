package com.fox.springboot.spring_course_springboot.exception_handling;

public class NoSuchEmployeeException  extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
