package main;
public class Perro extends Mascota{
	public Perro(String nombre, String raza, int edad){
		super(nombre, raza, edad);
	}
	@Override 
	public void dormir(){
		System.out.println("El perro duerme");
	}
}