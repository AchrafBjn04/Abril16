package com.softtek.Abril16.ejercicio5.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ClienteDAO {
    private iDAO conexion;

    public void insertar(Cliente c1){
    }
}
