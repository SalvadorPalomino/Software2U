package modulo1;
import java.sql.ResultSet;



public class LibroDAO {	
	
	public LibroDAO(){
		
	}
	
	public int añadirLibro(Libro l) throws Exception{		
		Agente agente=Agente.getAgente();			
		return agente.insert("INSERT INTO Libros (Isbn, Titulo, Autor, Editorial, Ejemplares) VALUES('"+ l.getIsbn() + "','" + l.getTitulo()+ "','" + l.getAutor() + "','" + l.getEditorial() + "','" + l.getEjemplares() + "');");	
	}

	public int modificarTitulo(Libro l) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Libros SET Titulo='" + l.getTitulo() + "'WHERE Isbn='" + l.getIsbn() + "';");
	}

	public int modificarAutor(Libro l) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Libros SET Autor='" + l.getAutor() + "'WHERE Isbn='" + l.getIsbn() + "';");
	}

	public int modificarEditorial(Libro l) throws Exception{
		Agente agente=Agente.getAgente();		
		return agente.update("UPDATE Libros SET Editorial='" + l.getEditorial() + "'WHERE Isbn='" + l.getIsbn() + "';");
	}
	
	public int modificarEjemplares(Libro l) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.update("UPDATE Libros SET Ejemplares='" + l.getEjemplares() + "'WHERE Isbn='" + l.getIsbn() + "';");
	}

	public String buscarLibro(Libro l) throws Exception{
		String valores=null;
		Agente agente=Agente.getAgente();
		ResultSet rs=agente.select("SELECT * FROM Libros WHERE Isbn = '"+l.getIsbn()+"';");
		while(rs.next()){
			valores=rs.getString("Titulo");
			valores+="/"+rs.getString("Autor");
			valores+="/"+rs.getString("Editorial");
			valores+="/"+rs.getString("Ejemplares");
		}
		return valores;
	}

	public int eliminarLibro(Libro l) throws Exception{
		Agente agente=Agente.getAgente();
		return agente.delete("DELETE FROM Libros WHERE Isbn = '"+l.getIsbn()+"';");
	}
	
	public String consultarEjemplares(Libro l) throws Exception{
		String valores=null;
		Agente agente=Agente.getAgente();
		ResultSet rs=agente.select("SELECT Ejemplares FROM Libros WHERE Isbn = '"+l.getIsbn()+"';");
		while(rs.next()){			
			valores=rs.getString("Ejemplares");
		}
		return valores;
	}
}
