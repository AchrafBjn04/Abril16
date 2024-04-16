package com.softtek.Abril16;

import com.softtek.Abril16.ejercicio1.modelo.Saludo;
import com.softtek.Abril16.ejercicio2.modelo.Conductor;
import com.softtek.Abril16.ejercicio3.modelo.Coche;
import com.softtek.Abril16.ejercicio3.modelo.SeguroCoche;
import com.softtek.Abril16.ejercicio4.modelo.Director;
import com.softtek.Abril16.ejercicio4.modelo.Jefe;
import com.softtek.Abril16.ejercicio4.modelo.Secretario;
import com.softtek.Abril16.ejercicio5.modelo.AccesoDesarrollo;
import com.softtek.Abril16.ejercicio5.modelo.AccesoProduccion;
import com.softtek.Abril16.ejercicio5.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	private Saludo saludo;
	@Autowired
	private Conductor conductor;
	@Autowired
	private SeguroCoche seguroCoche;
	@Autowired
	private Jefe jefe;
	@Autowired
	private Director director;
	@Autowired
	private Secretario secretario;
	@Autowired
	private Cliente cliente;
	@Autowired
	private AccesoDesarrollo ad;
	@Autowired
	private AccesoProduccion ap;

	public Abril16Application() {
	}

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Coche coche = new Coche("0000-ABC", "Audi A7");
		System.out.println(jefe.getInforme());
		System.out.println(jefe.getTareas());
		System.out.println(director.getInforme());
		System.out.println(director.getTareas());
		System.out.println(secretario.getInforme());
		System.out.println(secretario.getTareas());
		System.out.println(ad.insertar(cliente));
		System.out.println(ap.insertar(cliente));
		System.out.println(conductor.conducir());
	}
}