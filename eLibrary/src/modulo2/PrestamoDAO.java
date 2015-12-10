package modulo2;

import java.sql.ResultSet;
import modulo1.*;


public class PrestamoDAO {

	public PrestamoDAO(){
		
	}
	
	public int hacerPrestamo(Prestamo p) throws Exception{
		Agente agente=Agente.getAgente();			
		return agente.insert("INSERT INTO Prestamos (Isbn, Telefono, FInicio, FFin) VALUES('"+ p.getIsbn() + "','" + p.getTelefono() + "','" + p.getFechaInicio() + "','" + p.getFechaFin() +"');");	
	}
	
	public int modificarTelefono(Prestamo p) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Prestamos SET Telefono='" + p.getTelefono() + "'WHERE Isbn='" + p.getIsbn() + "';");
	}
	
	public int modificarFechaInicio(Prestamo p) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Prestamos SET FInicio='" + p.getFechaInicio() + "'WHERE Isbn='" + p.getIsbn() + "';");
	}
	
	public int modificarFechaFin(Prestamo p) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Prestamos SET FFin='" + p.getFechaFin() + "'WHERE Isbn='" + p.getIsbn() + "';");
	}

	public String buscarPrestamo(Prestamo p) throws Exception{
		String valores=null;
		Agente agente=Agente.getAgente();
		ResultSet rs=agente.select("SELECT * FROM Prestamos WHERE Isbn = '"+p.getIsbn()+"';");
		while(rs.next()){
			valores=rs.getString("Isbn");
			valores+="/"+rs.getString("Telefono");
			valores+="/"+rs.getString("FInicio");
			valores+="/"+rs.getString("FFin");
		}
		return valores;
	}

	public int eliminarPrestamo(Prestamo p) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.delete("DELETE FROM Prestamos WHERE Isbn = '"+p.getIsbn()+"';");
	}
}
