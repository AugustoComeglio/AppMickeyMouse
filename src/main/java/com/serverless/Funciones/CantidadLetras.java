package com.serverless.Funciones;

import java.util.function.Function;

public class CantidadLetras implements Function<String, Integer> {


    @Override
    public Integer apply(String value) {
        return value.length();
    }
}
