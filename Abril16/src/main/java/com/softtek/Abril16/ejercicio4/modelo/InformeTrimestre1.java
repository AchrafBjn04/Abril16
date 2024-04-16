package com.softtek.Abril16.ejercicio4.modelo;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Data
@ToString
public class InformeTrimestre1 implements Informe {
    @Override
    public String getInforme() {
        return "Obteniendo informe del trimestre 1.";
    }
}
