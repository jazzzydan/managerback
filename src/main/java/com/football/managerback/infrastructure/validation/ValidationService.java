package com.football.managerback.infrastructure.validation;

import com.football.managerback.domain.user.User;
import com.football.managerback.infrastructure.exception.ForbiddenException;

import java.util.Optional;

import static com.football.managerback.infrastructure.error.Error.INCORRECT_CREDENTIALS;

public class ValidationService {
    public static User getValidExistingUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) {
            throw new ForbiddenException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode());
        }
        return optionalUser.get();
    }
}
