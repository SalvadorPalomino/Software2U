package modulo3;

public class GestorAutenticarse {

	public GestorAutenticarse(){
		
	}
	
	public String autenticarse(Usuario u) throws Exception{		
		UsuarioDAO usuarioDAO=new UsuarioDAO();		
		return usuarioDAO.autenticarse(u);			
	}
	
}
