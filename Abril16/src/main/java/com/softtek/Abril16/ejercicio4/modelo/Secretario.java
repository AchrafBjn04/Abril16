package com.softtek.Abril16.ejercicio4.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Secretario implements Empleado {
    @Autowired
    @Qualifier("informeTrimestre1")
    private Informe informe;
    @Value("Softtek")
    private String empresa;
    @Value("secretario@softtek.com")
    private String email;

    @Override
    public String getTareas() {
        return "El secretario ha obtenido las tareas.";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
