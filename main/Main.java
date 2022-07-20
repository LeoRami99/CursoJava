package main;


public class Main{
	public static void main(String[] args) {
		/*//Esta es la clase de Perro
		Perro mona= new Perro();
		mona.establecerAtributos("Mona", "Criolla", 5);
		mona.nombre="Mona";
		mona.raza="Criolla";
		mona.edad=4;
		System.out.println("El nombre del perro es: "+ mona.nombre);
		System.out.println("El nombre del perro es: "+ mona.raza);
		System.out.println("El nombre del perro es: "+ mona.edad);
		mona.comer();
		mona.dormir();
		mona.ladrar();
		// Esta la clase de triangulo
		Triangulo triangulo = new Triangulo();
		triangulo.base=10;
		triangulo.altura=20;
		float resultado=triangulo.area();
		System.out.println(resultado);
		// Esta clase es de usuario
		Usuario leo = new Usuario("Leonardo", "Pass");
		leo.username="Leonardo";
		leo.setPassword("pass");
		System.out.println(leo.username);
		System.out.println(leo.getPassword());
		leo.saluda();
		// Calculadora clases
		Calculadora calculadora = new Calculadora();
		int resultadoCalculadora = calculadora.suma(2,4,6,8);
		System.out.println("El resultado es: "+ resultadoCalculadora);
		Circulo circulo = new Circulo(20.34f);
		System.out.println(circulo.area());
		System.out.println(Circulo.pi);*/
		/*Gato gato = new Gato("gato", "raza", 2);
		Perro perro = new Perro("perro", "raza", 4);
		gato.dormir();
		perro.dormir();*/
		Figura figuras[]= new Figura[2];
		Triangulo triangulos[];
		Figura circulo = new Circulo(9f);
		Figura triangulo = new Triangulo(10f, 5f);
		figuras[0]= circulo;
		figuras[1]=triangulo;
		System.out.println(figuras[0].area());
		System.out.println(figuras[1].area());
	}
}