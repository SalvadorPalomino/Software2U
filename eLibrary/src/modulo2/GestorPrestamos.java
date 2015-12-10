package modulo2;

import modulo1.*;
import modulo6.*;
import modulo5.*;
import modulo7.*;
import modulo9.*;

public class GestorPrestamos {	
	
	public GestorPrestamos() throws Exception{
		
	}
	
	public int hacerPrestamo(String isbn,String string,String fechaInicio,String fechaFin) throws Exception{
		Prestamo p=new Prestamo(isbn,string,fechaInicio,fechaFin);
		GestorHacerPrestamo g=new GestorHacerPrestamo();
		return g.hacerPrestamo(p);
	}

	public int modificarPrestamo(String isbn,String telefono,String fechaInicio,String fechaFin) throws Exception{
		Prestamo p=new Prestamo(isbn,telefono,fechaInicio,fechaFin);
		GestorModificarPrestamo g=new GestorModificarPrestamo();
		int res=0;
		if(telefono!=null){
			g.modificarTelefono(p);
			res=1;
		}
		if(fechaInicio!=null){
			g.modificarFechaInicio(p);
			res=1;
		}
		if(fechaFin!=null){
			g.modificarFechaFin(p);
			res=1;
		}		
		return res;		
	}

	public String buscarPrestamo(String isbn) throws Exception{
		Prestamo p=new Prestamo(isbn);		
		GestorBuscarPrestamo g=new GestorBuscarPrestamo();
		return g.buscarPrestamo(p);
	}

	public int eliminarPrestamo(String isbn) throws Exception{
		Prestamo p=new Prestamo(isbn);	
		GestorEliminarPrestamo g=new GestorEliminarPrestamo();
		return g.eliminarPrestamo(p);
	}
	
	public int modificarEjemplaresSumar(String isbn) throws Exception{
		Libro l=new Libro(isbn);	
		GestorModificarLibro g=new GestorModificarLibro();
		return g.modificarEjemplares(l);
	}
	
	public int modificarEjemplaresRestar(String isbn) throws Exception{
		Libro l=new Libro(isbn);	
		GestorModificarLibro g=new GestorModificarLibro();
		return g.modificarEjemplares(l);
	}
	
}
