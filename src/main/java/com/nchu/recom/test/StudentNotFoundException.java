package com.nchu.recom.test;

public class StudentNotFoundException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public int getErrCode() {
        return 101;
    }

    @Override
    public String getMessage() {
        return "Student not found ...";
    }
}
