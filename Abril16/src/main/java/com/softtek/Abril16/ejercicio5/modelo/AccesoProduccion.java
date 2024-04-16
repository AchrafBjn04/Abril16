package com.softtek.Abril16.ejercicio5.modelo;

import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements iDAO {
    @Override
    public String insertar(Cliente c1) {
        return "Cliente: [Nombre: " + c1.getNombre() + " - NIF: " + c1.getNIF() + "] insertado en AccesoProduccion con éxito.";
    }

    public AccesoProduccion() {
    }
}
