package com.softtek.Abril16.ejercicio3.modelo;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Data
@ToString
public class TallerMecanica implements iTaller {

    @Override
    public String reparar(Coche coche) {
        return "Reparando la mecánica del " + coche.getModelo() + " con matrícula " + coche.getMatricula() + ".";
    }
}
