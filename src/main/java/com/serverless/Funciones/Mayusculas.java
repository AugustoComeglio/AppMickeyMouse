package com.serverless.Funciones;


import java.util.function.Function;

public class Mayusculas implements Function<String, String> {

    @Override
    public String apply(String valor) {
        return valor.toUpperCase();
    }
}
