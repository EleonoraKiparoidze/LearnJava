package com.nora.chapter8.exception;

/**
 * Created by nora on 03.02.17.
 */
public class FlowerLogicException extends Exception {
    public FlowerLogicException(String message) {
        super(message);
    }

    public FlowerLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowerLogicException(Throwable cause) {
        super(cause);
    }

    public FlowerLogicException() {
    }
}
