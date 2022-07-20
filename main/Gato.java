package main;
public class Gato extends Mascota{
	public Gato(String nombre, String raza, int edad){
		super(nombre, raza, edad);
	}
	@Override 
	public void dormir(){
		super.dormir();
		System.out.println("El gato duerme");
	}

}