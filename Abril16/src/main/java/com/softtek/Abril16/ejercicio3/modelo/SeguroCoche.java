package com.softtek.Abril16.ejercicio3.modelo;

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
public class SeguroCoche {
    @Autowired
    @Qualifier("tallerMecanica")
    private iTaller taller;
    @Value("Mapfre")
    private String aseguradora;

    public String reparar(Coche c){
        return taller.reparar(c) + " [" + aseguradora + "]";
    }
}
