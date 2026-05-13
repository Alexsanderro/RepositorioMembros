package com.alexsander.membermanagement.exeption;

public class CpfInvalido extends RuntimeException {

    public CpfInvalido(String mensagem){
        super(mensagem);
    }

}