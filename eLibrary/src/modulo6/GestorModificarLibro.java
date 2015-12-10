package modulo6;
import modulo1.*;

public class GestorModificarLibro {
	
	public GestorModificarLibro(){
		
	}
	
	public int modificarTitulo(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarTitulo(l);
		
	}
	
	public int modificarAutor(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarAutor(l);
		
	}
	
	public int modificarEditorial(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarEditorial(l);
		
	}
	
	public int modificarEjemplares(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		return libroDAO.modificarEjemplares(l);		
	}
	
	public int modificarEjemplaresMas1(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		String ejemplares=libroDAO.consultarEjemplares(l);
		int n=Integer.parseInt(ejemplares)+1;
		l.setEjemplares(Integer.toString(n));
		return libroDAO.modificarEjemplares(l);		
	}
	
	public int modificarEjemplaresMenos1(Libro l) throws Exception{
		LibroDAO libroDAO=new LibroDAO();
		String ejemplares=libroDAO.consultarEjemplares(l);
		int n=Integer.parseInt(ejemplares)-1;
		l.setEjemplares(Integer.toString(n));
		return libroDAO.modificarEjemplares(l);		
	}
}
