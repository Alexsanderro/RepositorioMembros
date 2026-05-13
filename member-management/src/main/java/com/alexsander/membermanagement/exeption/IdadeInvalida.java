package com.alexsander.membermanagement.exeption;

public class IdadeInvalida extends RuntimeException{

    public IdadeInvalida(){
        super("Membro menor de 18 anos!");
    }

}
