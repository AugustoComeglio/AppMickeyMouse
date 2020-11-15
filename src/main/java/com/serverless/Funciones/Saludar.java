package com.serverless.Funciones;

import java.util.function.Function;

public class Saludar implements Function<String,String> {
    @Override
    public String apply(String s) {
        return "Hola " + s + ", y bienvenido a Spring Cloud Function!!!";
    }
}
