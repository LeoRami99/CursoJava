import java.util.Arrays;

public class Ejercicios {
	public static void main(String[] args) {
		//numAlea();
		ejeMatriz();
	}
	public static void numAlea(){
		int numAleatorios[] = new int[100];
		int numMayor= 0, numMenor=1;
		for (int i=0;i<numAleatorios.length;i++ ) {
			numAleatorios[i]=(int)(Math.random()*101 );
			System.out.println(numAleatorios[i]);
			if (numAleatorios[i]<numMenor) numMenor=numAleatorios[i];
			
			if (numAleatorios[i]>numMayor) numMayor=numAleatorios[i];
			else continue;
		}
		/*for (int indice : numAleatorios) {
			System.out.println("Numeros:" + indice);
		}*/
		System.out.println("El numero mayor es: "+ numMayor);
		System.out.println("El numero menor es: "+ numMenor);
		//forma ascendent
		Arrays.sort(numAleatorios,0,100);
		for (int i : numAleatorios) {
			System.out.println("Orden: "+ i);
		}
		//promedio
		int suma=0;
		for (int indice : numAleatorios) {
			suma+=indice;
		}
		System.out.println("La suma es: " + suma);
		float promedio=suma/numAleatorios.length;
		System.out.println("El promedio es: " + promedio);
		int sumaFL=numAleatorios[0]+numAleatorios[99];
		System.out.println("Suma del primer y ultimo elemento: "+sumaFL);
		for (int i = 0; i < numAleatorios.length; i++) {
			if (numAleatorios[i]==100) {
				System.out.println("Existe cien");
			}
		}
		for (int i=1;i<numAleatorios.length ;i++) {		
		int con=0;
			for (int c=1;c<=numAleatorios[i] ;c++ ) {
				if (numAleatorios[i]%c==0) {
					con++;
				}
			}
				if (con==2) {
					System.out.println(numAleatorios[i]+" Es primo");
				}else{
					System.out.println(numAleatorios[i]+" No es primo");
				}
		}
		//Numeros pares
		for (int i=0;i<numAleatorios.length ;i++ ) {
			if (numAleatorios[i]%2==0) {
				System.out.println(numAleatorios[i]+" Es par");
			}else System.out.println(numAleatorios[i]+ " No es par");
		}
	}
	public static void ejeMatriz(){
		int[][] matrizAle=new int[5][5];
		for (int i=0;i<matrizAle.length ;i++ ) {
			for (int j=0;j<matrizAle.length ;j++ ) {
				matrizAle[i][j]=(int)(Math.random()*100);
				System.out.print("["+matrizAle[i][j]+"]");
			}
			System.out.println("");
		}
		System.out.println(matrizAle.length);
		//Promedio de la matriz
		int suma=0;
		for (int i=0;i<matrizAle.length ;i++ ) {
			for (int j=0;j<matrizAle.length ;j++ ) {
				suma+=matrizAle[i][j];
			}
		}
		System.out.println("El promedio de la matriz es:"+(suma/(matrizAle.length*2)));
		//Numero mayor
		int numMayor=0;
		int contCantidad=0;
		for (int i=0;i<matrizAle.length ;i++ ) {
			for (int j=0;j<matrizAle.length ;j++ ) {
				if (matrizAle[i][j]>numMayor) {
					numMayor=matrizAle[i][j];
				}
			}
		}
		for (int i=0;i<matrizAle.length ;i++ ) {
			for (int j=0;j<matrizAle.length ;j++ ) {
				if (numMayor==matrizAle[i][j]) contCantidad++;
			}
		}
		System.out.println("Este es el numero mayor: "+numMayor+" y se repite: "+contCantidad);
		//Numeros primos
		for (int x[] : matrizAle) {
			for (int y :x ) {
				int con=0;
				for (int i=1;i<=y ;i++ ) {
					if (y%i==0) {
						con++;
					}
				}
				if (con==2) {
					System.out.println("Es primo:"+y);
				}else{
					System.out.println("No es primo: "+y);
				}
			}
		}
		//Numeros pares
		for (int x[] : matrizAle) {
			for (int y :x ) {
				if (y%2==0) {
					System.out.println(y+" Es par");
				}else{
					System.out.println(y+" No es par");
				}
			}
		}
		//Suma digonal
		int sumaDiag=0;
		for (int i=0;i<matrizAle.length ;i++ ) {
			sumaDiag+=matrizAle[i][i];
		}
		System.out.println("La suma diagonal es: "+sumaDiag);
		//Suma de ultima fila
		int sumaLFila=0;
		for (int i=0;i<matrizAle.length ;i++ ) {
			sumaLFila+=matrizAle[matrizAle.length-1][i];
		}
		System.out.print("Suma de la ultima fila: "+sumaLFila);
	}
}