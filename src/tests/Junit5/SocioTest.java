package tests.Junit5;

import static org.junit.Assert.assertThrows;
import static org.testng.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import parcial.tdyv.java.Actividad;
import parcial.tdyv.java.NoExisteSocioException;
import parcial.tdyv.java.NominaSocios;
import parcial.tdyv.java.OfertaActividades;
import parcial.tdyv.java.Persona;
import parcial.tdyv.java.YaExisteSocioException;

public class SocioTest {
	
	@Test
	public void socioRepetido() throws YaExisteSocioException {
		Persona persona0 = new Persona("Seba", "Esains","42.322.529",50);
		NominaSocios.Asociar(persona0);
		assertThrows(YaExisteSocioException.class, () -> NominaSocios.Asociar(persona0));
	}
	
	//Comprobar que no es posible agregar actividades repetidas
	@Test
	public void actividadRepetida() throws NoExisteSocioException {
		Persona persona0 = new Persona("Seba", "Esains","42.322.529",50);
		Actividad actividad0 = new Actividad("Natación", persona0, 10, 12);
		OfertaActividades.NuevaActividad(actividad0);
		assertFalse(OfertaActividades.NuevaActividad(actividad0));
	}
	
	// Comprobar que el método toString() devuelve una cadena con el formato <Apellido>, <Nombre>
	public void validarToString() {
		
	}

}