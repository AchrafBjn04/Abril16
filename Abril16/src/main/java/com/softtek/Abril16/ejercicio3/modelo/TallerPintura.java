package com.softtek.Abril16.ejercicio3.modelo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class TallerPintura implements iTaller {

     @Override
    public String reparar(Coche coche) {
        return "Reparando la carroceria del " + coche.getModelo() + " con matrícula " + coche.getMatricula() + ".";
    }
}
