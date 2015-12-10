package modulo5;
import modulo2.*;

public class GestorBuscarPrestamo {

	public GestorBuscarPrestamo(){
		
	}
	
	public String buscarPrestamo(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.buscarPrestamo(p);
	}
	
}
