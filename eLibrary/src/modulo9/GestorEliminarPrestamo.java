package modulo9;
import modulo2.*;

public class GestorEliminarPrestamo {

	public GestorEliminarPrestamo(){
		
	}
	
	public int eliminarPrestamo(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.eliminarPrestamo(p);
	}
	
}
