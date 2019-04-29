package com.gmail.shilovich.stas.servicemodule.exception;

import java.sql.SQLException;

public class ServiceException extends RuntimeException {

    public ServiceException(String errorMessage) {
        super(errorMessage);
    }

    public ServiceException(String errorMessage, Throwable e) {
        super(errorMessage);
    }
}
