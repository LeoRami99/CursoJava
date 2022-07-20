package main;
public class Usuario{
	// default
	// public
	// private
	// protected
	public String username;
	private String password;
	public Usuario(String username, String password){
		// System.out.println("Creacion de un nuevo objeto tipo usuario");
		this.username=username;
		this.password=password;
	}

	public void saluda(){
		System.out.println("Hola mi nombre es "+this.username);
	}

	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}