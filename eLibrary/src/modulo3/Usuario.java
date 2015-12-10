package modulo3;

public class Usuario {
	
private String login;
private String password;

public Usuario(String login) throws Exception{
	this.login = login;
}

public String getLogin(){
	return this.login;
}

public String getPassword(){
	return this.password;
}

public void setLogin(String login){
	this.login=login;
}

public void setPassword(String password){
	this.password=password;
}

}
