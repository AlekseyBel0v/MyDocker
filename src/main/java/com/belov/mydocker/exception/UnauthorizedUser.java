package com.belov.mydocker.exception;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
