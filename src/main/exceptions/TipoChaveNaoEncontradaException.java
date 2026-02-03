package main.exceptions;

import java.io.Serial;

public class TipoChaveNaoEncontradaException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public TipoChaveNaoEncontradaException(String msg){
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String mensage, Throwable e){
        super(mensage, e);
    }
}
