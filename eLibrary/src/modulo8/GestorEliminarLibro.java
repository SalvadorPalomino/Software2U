package modulo8;
import modulo1.*;

public class GestorEliminarLibro {

	public GestorEliminarLibro(){
		
	}
	
	public int eliminarLibro(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.eliminarLibro(l);		
	}
	
}
