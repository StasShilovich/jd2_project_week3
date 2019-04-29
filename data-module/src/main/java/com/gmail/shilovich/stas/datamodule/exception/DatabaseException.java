package com.gmail.shilovich.stas.datamodule.exception;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String errorMessage) {
        super(errorMessage);
    }

    public DatabaseException(String errorMessage, Throwable e) {
        super(errorMessage);
    }
}
