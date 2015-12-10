package modulo3;

import java.sql.ResultSet;
import modulo1.*;


public class UsuarioDAO {
	
	public UsuarioDAO(){
		
	}	
	
	public String autenticarse(Usuario u) throws Exception{
		
		Agente agente=Agente.getAgente();
		String password = "";
		ResultSet rs=agente.select("SELECT Password FROM Usuarios");	
		
		while(rs.next()){	         		
	         password=rs.getString("Password");
		}
		
		return password;
	}
}
