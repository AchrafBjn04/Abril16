package com.softtek.Abril16.ejercicio4.modelo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class InformeTrimestre2 implements Informe {

    @Override
    public String getInforme() {
        return "Obteniendo informe del trimestre 2.";
    }
}
