package com.softtek.Abril16.ejercicio5.modelo;

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
public class Cliente {
    @Value("Achraf")
    private String nombre;
    @Value("123456789N")
    private String NIF;
}
