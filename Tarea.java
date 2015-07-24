/**
 * @(#)Tarea.java
 *
 *
 * @author Otoniel Alexander Hernandez Arias
 * ID 201114771
 * @version 1.00 2012/6/17
 */

import java.util.Scanner;
import java.io.*;
public class Tarea {


    public static void menu(){
    	
    	System.out.println("\t \t Menu \n");  	
    	System.out.println("Escoja el numero de las siguientes opciones o operaciones a realizar:\n");
    	System.out.println("\t 1)Multiplicacion \n \t 2)Serie \n \t 3)Salir \n");
    	Scanner leer1=new Scanner(System.in);
    	int opcion=leer1.nextInt();
    	
    	switch (opcion) {
    case 1: multi();
    	break;
    case 2: serie();
    	break;
    case 3:
    	System.out.println("\t 3)Salir"); 
    	System.out.println("\t ¡¡Adios!!");
    		System.exit(3);
    	break;
    default :
    	System.out.println("Escoja un numero de las siguientes opciones \n");
    	menu();
	}
    }

	/* este comentario es sobre otra forma de pedir el nombre y el carne sin que de error lo unico que tiene que hacer es 
	 *poner como comentario donde esta el comentario que dice opcion 2 hasta el otro comentraio que dice comentario opcion
	 *2 final y quitar el texto del comentario de metodo IngresarDatos "que esta acontinuacion", poner en comentario 
	 *throws IOException del metodo main y quitar lo que hace comentario al try hasta catch en el metodo main */  
    
   /* public static void IngresarDatos()throws IOException {
    BufferedReader Info=new BufferedReader(new InputStreamReader(System.in));
    String usuario;
    
    System.out.println("\n Ingrese su nombre completo:");
    usuario=Info.readLine();
    
    System.out.println("\n Ingrese su carne:");
    Scanner Info1=new Scanner(System.in);
    int id=Info1.nextInt();
    
    System.out.println("\n Bienvenido \n Usuario: "+usuario+"\t Carne: "+id+"\n");	
    }*/
    
    
    public static void multi(){
    	Scanner LeerMulti=new Scanner(System.in);
    	
    	System.out.println("\t 1)Multiplicacion");
    	System.out.println("\t Multiplique dos numero:");
    	
    	System.out.println("Ingrese primer numero:");
    	int Dato1Multi=LeerMulti.nextInt();
    	
    	System.out.println("Ingrese segundo numero:");
    	int Dato2Multi=LeerMulti.nextInt();
    	
    	int ResultadoMulti=Dato1Multi*Dato2Multi;
    	
    	System.out.println("El resultado es:"+Dato1Multi+"*"+Dato2Multi+"="+ResultadoMulti+"\n");
    	
    	if(ResultadoMulti%2==0){
    	System.out.println("El resultado es un numero par");
    	menu();
    	}
    	else{
    		menu();
    	}
    	
    	
    }
    
    public static void serie(){/*No mucho entiendo lo que hay que hacer aqui pero el primer proceso es la serie del primer numero hasta 
    el liminte o mejor dicho la sumatario de el primera+..+ultimo nuemro;
    el segundo proceso con los numero es es la suma de el primer numero  */
    	Scanner LeerNoSerie=new Scanner(System.in);
    	
    	System.out.println("\t 2)Serie");
    	System.out.println("\t Ingrese dos numero: \n El primer No. de la sucecion \n El segundo sera el final de la sucecion \n ");
    	
    	System.out.println("Ingrese primer numero:");
    	int No1=LeerNoSerie.nextInt();
    	
    	System.out.println("Ingrese limite:");
    	int Lim=LeerNoSerie.nextInt();
    
    //inicio de primer proceso especificado en el encabezado del metodo. Exclusivo en el metodo serie()	
    	int suma=0;
    	int nn=No1;
    	while(No1<=Lim){
    		suma=suma + No1;
    		No1++;
    		}
	
    	System.out.println("\n La suma(sumatoria) de la serie de "+nn+"+..+"+Lim+" es:\t"+suma+"\n");

//inicio del segundo proceso especificado en el encabezado del metodo. Exclusivo en el metodo serie()

	int DatoCambia;
	DatoCambia=No1;
	while(true){
	DatoCambia++;
	if(DatoCambia==Lim){
		break;
	}
	}
	
	int PrimerUltimo=nn+DatoCambia;//nn es un int que lo traigo desde el primer while que no cambia y asi lo puedo utilizarlo de nuevo
	System.out.println("El ultimo mas el primero de la serie:\n\t"+DatoCambia+"+"+nn+"="+PrimerUltimo+"\n");

    	menu();
    	
    }
    
    public static void main (String[] args) throws IOException {//para pobar la opcion 2 ponga como comentario throws IOException
    System.out.println("\t \t Bienvenido!! ");
    
    /* //quite de aqui los comentario para probar la opcion2
     try {
    IngresarDatos();
	}
	catch (IOException e) {
	}*/
	
	//opcion2; para probar la opcion 2 poner aqui como comentario hasta donde dice opcion2 final
    BufferedReader Info=new BufferedReader(new InputStreamReader(System.in));
    String usuario;
    
    System.out.println("\n Ingrese su nombre completo:");
    usuario=Info.readLine();
    
    System.out.println("\n Ingrese su carne:");
    Scanner Info1=new Scanner(System.in);
    int id=Info1.nextInt();
    
    System.out.println("\n Bienvenido \n Usuario: "+usuario+"\t Carne: "+id+"\n");
	//opcion 2 final
    
    menu();	
}
    
}