package com.anapedra.desafiocontrolefluxo.exceptions;


import java.io.Serial;

public class ParametrosInvalidosException extends RuntimeException  {

    @Serial
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}