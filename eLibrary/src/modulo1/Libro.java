package modulo1;


public class Libro {
	
private String isbn;
private String titulo;
private String autor;
private String editorial;
private String ejemplares;

public Libro(String isbn, String titulo, String autor, String editorial,String ejemplares) throws Exception{
	this.isbn = isbn;
	this.titulo = titulo;
	this.autor = autor;
	this.editorial = editorial;
	this.ejemplares = ejemplares;	
}
public Libro(String isbn) throws Exception{
	this.isbn = isbn;	
}

public String getIsbn() {
	return this.isbn;
}

public String getTitulo() {
	return this.titulo;
}

public String getAutor() {
	return this.autor;
}

public String getEditorial() {
	return this.editorial;
}

public String getEjemplares() {
	return this.ejemplares;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public void setEjemplares(String ejemplares) {
	this.ejemplares = ejemplares;
}

}