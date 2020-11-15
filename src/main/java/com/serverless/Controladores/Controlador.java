package com.serverless.Controladores;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class Controlador {

    @Bean
    public Function<String, String> function() {
        return input -> input;
    }
    @Bean
    public Consumer<String> consume() {
        return input -> {
            System.err.println("Entrada-" + input);
        };
    }
    @Bean
    public Supplier<String> supply() {
        return () -> "Saludos desde Supplier";
    }
}


