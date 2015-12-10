package modulo7;

import modulo1.*;
import modulo2.*;

public class GestorModificarPrestamo {

	public GestorModificarPrestamo(){
		
	}	
	
	public int modificarTelefono(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.modificarTelefono(p);		
	}
	
	public int modificarFechaInicio(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.modificarFechaInicio(p);		
	}
	
	public int modificarFechaFin(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.modificarFechaFin(p);		
	}
	
	public int modificarEjemplaresSumar(Libro l)throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarEjemplares(l);
	}
	
	public int modificarEjemplaresRestar(Libro l)throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarEjemplares(l);
	}
	
}
