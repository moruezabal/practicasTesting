package tests.testNG;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

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
		  assertThrows(YaExisteSocioException.class, () -> NominaSocios.Asociar(persona0)); }
	  
	  //Comprobar que no es posible agregar actividades repetidas
	  @Test
	  public void actividadRepetida() { //modificando el método NuevaActividad para que devuelva booleano 
		  Persona persona0 = new Persona("Seba", "Esains","42.322.529",50); 
		  Actividad actividad0 = new Actividad("Natación", persona0, 10, 12);
		  OfertaActividades.NuevaActividad(actividad0);
		  assertFalse(OfertaActividades.NuevaActividad(actividad0));
	  };  
	
	/*
	 * // Comprobar que el encargado de una actividad es un socio de la nómina
	 * 
	 * @Test public void encargadoEsSocio() { Persona persona0 = new Persona("Seba",
	 * "Esains","42.322.529",50); assertThrows(NullPointerException.class, () -> new
	 * Actividad("Natación", persona0, 10, 12));
	 * System.out.println(OfertaActividades.GetNomina()); }
	 */


	// Comprobar que el método toString() devuelve una cadena con el formato <Apellido>, <Nombre>
	
	@Test
	public void validarToString() {
		
	}

}