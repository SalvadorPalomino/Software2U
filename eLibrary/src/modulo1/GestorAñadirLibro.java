package modulo1;

public class GestorAñadirLibro {

	public GestorAñadirLibro(){
		
	}
	
	public int añadirLibro(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();		
		return libroDAO.añadirLibro(l);
	}
	
}
