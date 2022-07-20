package main;

public class Calculadora {
    public int suma(int... numeros){ //n cantidad de parametros se convierte en una arreglo
        int suma=0;
        for (int numero : numeros) 
            suma+=numero;
            
        return suma;
        
    }
    public int suma (int valor1, int valor2){
    	return valor1+valor2;
    }
    public float suma(float valor1, float valor2){
    	return valor1+valor2;
    }
    public double suma(double valor1, double valor2){
    	return valor1+valor2;
    }
}
