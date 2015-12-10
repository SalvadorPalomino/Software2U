package modulo1;

import modulo4.GestorBuscarLibro;
import modulo6.*;
import modulo8.GestorEliminarLibro;


public class GestorLibros {	
	
	public GestorLibros() throws Exception{
		
	}
	
	public int añadirLibro(String isbn,String titulo,String autor,String editorial, String ejemplares) throws Exception{
		Libro l=new Libro(isbn,titulo,autor,editorial,ejemplares);		
		GestorAñadirLibro g=new GestorAñadirLibro();
		return g.añadirLibro(l);
	}

	public int modificarLibro(String isbn,String titulo,String autor,String editorial, String ejemplares) throws Exception{
		Libro l=new Libro(isbn,titulo,autor,editorial,ejemplares);
		GestorModificarLibro g=new GestorModificarLibro();
		int res=0;
		if(titulo!=null){
			g.modificarTitulo(l);
			res=1;
		}
		if(autor!=null){
			g.modificarAutor(l);
			res=1;
		}
		if(editorial!=null){
			g.modificarEditorial(l);
			res=1;
		}
		if(ejemplares!=null){			
			g.modificarEjemplares(l);
			res=1;
		}
		return res;
	}

	public String buscarLibro(String isbn) throws Exception{
		Libro l=new Libro(isbn);
		GestorBuscarLibro g=new GestorBuscarLibro();
		return g.buscarLibro(l);
	}

	public int eliminarLibro(String isbn) throws Exception{
		Libro l=new Libro(isbn);
		GestorEliminarLibro g=new GestorEliminarLibro();
		return g.eliminarLibro(l);
	}
	
	public int modificarEjemplaresSumar(String isbn) throws Exception{
		Libro l=new Libro(isbn);
		GestorModificarLibro g=new GestorModificarLibro();
		return g.modificarEjemplaresMenos1(l);
	}
	
	public int modificarEjemplaresRestar(String isbn) throws Exception{
		Libro l=new Libro(isbn);
		GestorModificarLibro g=new GestorModificarLibro();
		return g.modificarEjemplaresMas1(l);
	}
}
