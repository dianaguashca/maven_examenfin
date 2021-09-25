package examen.finnal;

import java.util.Scanner;

public class ConsersionarioAmbacar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		
		int opcion =0;
		do {
			System.out.println("CONSERSIONARIO AMBACAR");
			System.out.println("#################################");
			System.out.println("Elija una opcion:");
			System.out.println("1.Ingresar Auto");
			System.out.println("2.Consultar Auto");
			System.out.println("3.Actualizar Kilometraje");
		    System.out.println("4.Imprimir Reporte");
		    System.out.println("5.SALIR");
		    opcion = lector.nextInt();
           if(opcion==1) {
        	   System.out.println("Escoja el auto que desee");
        	   System.out.println("a.- auto nacional");
        	   System.out.println("b.- auto importado");
        	   System.out.println("#################################");
        	   System.out.println("seleccione opcion");
        	   String opcionauto=lector.nextLine();
        	   if(opcionauto.equals("a")) {
        		   System.out.println("Ingrese la siguiente informacion");
        		   System.out.println("Marca");
        		   String marca=lector.nextLine();
        		   System.out.println("Modelo");
        		   String modelo=lector.nextLine();
        		   System.out.println("Año de Fabricacion");
        		   int anio=lector.nextInt();
        		   System.out.println("Placa");
        		   int placa=lector.nextInt();
        		   System.out.println("Kilometraje");
        		   int kilome=lector.nextInt();
        		   
        		   System.out.println("#################################");
            	   System.out.println("Codigo Nacional");
            	   int autosNacional[]=new int [100];
        		   autosNacional[0]=marca;
        		   
        	   }else if(opcionauto.equals("b")) {
        		   
        		  System.out.println("Ingrese la siguiente informacion");
        		  System.out.println("Marca");
        		  
        		  System.out.println("Codigo de importacion");
        		   int codigo=lector.nextInt();
        		   System.out.println("Valor de la importacion");
        		   int valor=lector.nextInt();
        		   
        		   
        	   }
        	   
           }
		    
		    
		}while(opcion ==5);
		System.out.println("Gracias por preferirnos");
	}

}
