package com.softtek.Abril16.ejercicio4.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Director implements Empleado {
    @Autowired
    @Qualifier("informeTrimestre1")
    private Informe informe;

    @Override
    public String getTareas() {
        return "El director ha obtenido las tareas.";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
