package modulo2;

public class GestorHacerPrestamo {

	public GestorHacerPrestamo(){
		
	}
	
	public int hacerPrestamo(Prestamo p) throws Exception{
		PrestamoDAO prestamoDAO=new PrestamoDAO();
		return prestamoDAO.hacerPrestamo(p);
	}
	
}
