package main;
public class Circulo extends Figura{
	public static final float pi=3.1415926f;
	public float radio;
	public Circulo(float radio){
		this.radio=radio;
	}
	@Override
	public float area(){
		return Circulo.pi*(this.radio*this.radio);
	}
}