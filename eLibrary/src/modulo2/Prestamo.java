package modulo2;


public class Prestamo {
	
private String isbn;
private String telefono;
private String fechaInicio;
private String fechaFin;


public Prestamo(String isbn, String telefono, String fechaInicio, String fechaFin) throws Exception{
	this.isbn = isbn;
	this.telefono = telefono;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
}
public Prestamo(String isbn) throws Exception{
	this.isbn = isbn;	
}
public String getIsbn() {
	return this.isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTelefono() {
	return this.telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getFechaInicio() {
	return this.fechaInicio;
}
public void setFechaInicio(String fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public String getFechaFin() {
	return this.fechaFin;
}
public void setFechaFin(String fechaFin) {
	this.fechaFin = fechaFin;
}

}