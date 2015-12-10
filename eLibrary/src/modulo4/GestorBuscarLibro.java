package modulo4;
import modulo1.*;

public class GestorBuscarLibro {
	
	public GestorBuscarLibro(){
		
	}
	
	public String buscarLibro(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.buscarLibro(l);		
	}
}
