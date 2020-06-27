package com.mahixcode.alfabattle.exception;

import javax.annotation.Nonnull;

public class NotFoundException extends ClientException {

    public NotFoundException(@Nonnull final String message) {
        super(message);
    }
}
