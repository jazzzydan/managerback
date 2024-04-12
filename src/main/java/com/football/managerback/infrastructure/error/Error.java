package com.football.managerback.infrastructure.error;

import lombok.Getter;

@Getter
public enum Error {
    INCORRECT_CREDENTIALS("Vale kasutajanimi või parool", 111),

    USERNAME_UNAVAILABLE("username is not unique", 333),
    EMAIL_UNAVAILABLE("e-mail is not unique", 333);

    private final String message;
    private final int errorCode;

    Error(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
