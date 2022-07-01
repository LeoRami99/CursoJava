public class Main {
    public static void main(String[] args) {
        // int contador = 0;
        // System.out.println(contador);
        // do {
        // System.out.println("Hola");
        // contador++;
        // } while (contador<10);
        // // while(contador<10){
        // // System.out.println(contador);
        // // contador++;
        // // }
        // for (int numero = 9, x=1; x < 11 ; x++) {
        // int resultado=numero*x;
        // String mensaje = numero+"*"+x+"="+resultado;
        // System.out.println(mensaje);
        // }
        // for (int numero = 1; numero < 101; numero++) {
        // if(numero%2==0){
        // System.out.println(numero);
        // }

        // }
        // int valor=0;
        // switch(valor){
        // case 10:
        // System.out.println("Es 10");
        // break;
        // default:
        // System.out.println("No es 10");
        // }
        // for (int i = 0; i < 101; i++) {
        // if(i==50){
        // break;
        // }
        // System.out.println(i);
        // }
        // for (int index = 0; index < 10; index++) {
        // if(index==5) continue;
        // System.out.println(index);
        // }

        // Ejercicio 1
        /*notaEstudiante(69);
        System.out.println("");
        ascendete(5, 2, 100);
        System.out.println("");
        multiNine();
        System.out.println("");
        aster();
        System.out.println("");
        asterArbol();
        System.out.println("");
        fibonacci();
        System.out.println("");
        primos(1);
        factorial(0);
        euler();
        multiplos();*/
        //arreglos();
        arreglosEjercicios();
    }

    public static void notaEstudiante(int nota) {
        if (nota >= 70)
            System.out.print("Aprobado");
        else
            System.out.print("Reprobado");
    }

    public static void ascendete(int numOne, int numTow, int numTre) {
        if (numOne < numTow && numTow < numTre) {
            System.out.println(numOne + "," + numTow + "," + numTre);
        } else if (numTow < numOne && numOne < numTre) {
            System.out.println(numTow + "," + numOne + "," + numTre);
        } else if (numTre < numOne && numOne < numTow) {
            System.out.println(numTre + "," + numOne + "," + numTow);
        }
    }

    public static void multiNine() {
        // int numero=0;
        for (int numero = 9, x = 1; x < 11; x++) {
            int resultado = numero * x;
            System.out.println(numero + "*" + x + "=" + resultado);
        }
    }

    public static void aster() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void asterArbol() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=(i*2)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void fibonacci(){
        int a=0,b=1,c=0;
        for (int i = 0; i < 11; i++) {
           a=b;
           b=c;
           c=a+b;
           System.out.println(c);
        }
    }
    public static void primos(int numero){
       int contador=2;
       boolean b=true;
       while (b&&(contador<numero)) {
           if((numero%contador)==0){
                System.out.println("No es primo");
            
           }else{
                System.out.println("Es primo");
           }
        
       }
    }
    public static void factorial(int numero) {
        int resultad=1;
        for (int i = 0; i <= numero; i++) {
            resultad*=i+1;
            System.out.println(resultad);
        }
    }
    public static void euler() {
        double resultad=1;
        double aux=0;
        for (int i = 0; i <= 1000; i++) {
            resultad*=i+1;
            aux=aux+(1/resultad);
            System.out.println(aux);
        }
    }
    public static void multiplos() {
        // boolean exit=true;
        int contador=0;
        int numero=1;
        do {
            numero=numero+2;
            // contador++;
            System.out.println(numero);
        } while (numero<=4571);
    }

    //arreglos
    public static void arreglos(){
        String nombres[];
        nombres= new String[3];
        //se agrega mediante indices
        //3=0,1,2,
        nombres[0]="Codi 1";
        nombres[1]="Codi 2";
        nombres[2]="Codi 3";
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);

        String apellidos[]= new String[3];
        String nombre[]= {"Juan","Codi","Ramirez"};
        System.out.println(nombre[0]);
        System.out.println(nombre[1]);
        System.out.println(nombre[2]);
        //recorrido de arreglos con for 
        int calificaciones[]={1,2,3,5,6,7,2,7,8};
        //suma/cantidad
        System.out.println(calificaciones.length);
        //0-8
        int suma=0;
        for (int i=0;i<calificaciones.length;i++) {
            System.out.println(calificaciones[i]);
            suma+=calificaciones[i];
        }
        float promedio=suma/calificaciones.length;
        System.out.println("El promedio es: "+promedio);
        System.out.println("la suma es:"+suma);
        //ejemplo de string como arreglo
        String mensaje="Hola Mundo";
        System.out.println(mensaje.length());
        char letraH=mensaje.charAt(0);
        System.out.println(letraH);
        //indexOf & lastIndexOf
        int indice = mensaje.indexOf("M");
        System.out.println(indice);
        String mensajeplus="Este mensaje contiene muchas letras a";
        int indicePrimeraA=mensajeplus.indexOf("a");
        int indiceSegundaA= mensajeplus.indexOf("a", indicePrimeraA + 1);
        System.out.println("a"+indicePrimeraA);
        System.out.println(indiceSegundaA);

        //Substring
        int indiceLetraM=mensaje.indexOf("M");
        String subString= mensaje.substring(indiceLetraM);
        System.out.println(subString);
        String nuevoSubString= mensaje.substring(indiceLetraM,indiceLetraM+2);
        System.out.println(nuevoSubString);
        //foreach
        for ( int valorPorIndice: calificaciones) {
            System.out.println("Resultado del foreach: "+valorPorIndice);
            suma+=valorPorIndice;
        }
        System.out.println(suma);

        //Modificar e insertar datos
        int valores[]=new int[10];
        for (int i=0;i<valores.length ;i++ ) {
            valores[i]=i;
        }
        for (int indiceValor : valores) {
            System.out.println(indiceValor);
        }
        //Arreglos multidimensionales
        int matriz[][]= new int[4][3];
        //x=0 y=0
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;

        matriz[1][0]=1;
        matriz[1][1]=2;
        matriz[1][2]=3;

        matriz[2][0]=1;
        matriz[2][1]=2;
        matriz[2][2]=3;

        matriz[3][0]=1;
        matriz[3][1]=2;
        matriz[3][2]=3;
        System.out.println("Resultado matriz: "+matriz[0][0]);
        for (int posX=0;posX<matriz.length;posX++) {
            for (int posY=0;posY<matriz[posX].length;posY++) {
                System.out.print(matriz[posX][posY]);   
            }
            System.out.println(" ");
        }
        for (int fila[] : matriz) {
            for (int celda : fila) {
                System.out.println(celda);
            }
        }

    }
    public static void arreglosEjercicios() {
        int arregloCienNum[]=new int[100];
        for (int i=0;i<arregloCienNum.length ;i++ ) {
            arregloCienNum[i]=i;
            System.out.println(arregloCienNum[i]);
        }
        for (int i=0;i<arregloCienNum.length ;i++ ) {
            arregloCienNum[i]=(int)(Math.random()*100);
            System.out.println(arregloCienNum[i]);
        }
    }

}