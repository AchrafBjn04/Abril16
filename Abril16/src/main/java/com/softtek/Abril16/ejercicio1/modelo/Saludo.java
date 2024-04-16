package com.softtek.Abril16.ejercicio1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Saludo {
    @Value("Bienvenido eres.")
    private String mensajeBienvenida;
}
