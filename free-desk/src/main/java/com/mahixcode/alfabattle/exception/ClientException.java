package com.mahixcode.alfabattle.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ClientException extends RuntimeException {

    private final String message;

}
