package modulo3;



public class GestorUsuarios {	
	
	public GestorUsuarios() throws Exception{
		
	}

	public String autenticarse(String login) throws Exception{		
		Usuario u=new Usuario(login);
		GestorAutenticarse g=new GestorAutenticarse();
		return g.autenticarse(u);
	}	
}