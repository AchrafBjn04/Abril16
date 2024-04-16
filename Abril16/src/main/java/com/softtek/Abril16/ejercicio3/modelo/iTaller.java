package com.softtek.Abril16.ejercicio3.modelo;

import org.springframework.stereotype.Component;

@Component
public interface iTaller {
    String reparar(Coche coche);
}
