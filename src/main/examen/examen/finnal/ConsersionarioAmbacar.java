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
            	   Auto autoNacional[]=new Auto[100];
        	
        		   
        	   }else if(opcionauto.equals("b")) {
        		   
        		  System.out.println("Ingrese la siguiente informacion");
        		  System.out.println("Marca");
        		  String marcaI=lector.nextLine();
        		  System.out.println("Modelo");
        		  String modeloI=lector.nextLine();
        		  System.out.println("Año Fabricacion");
        		  int anioI=lector.nextInt();
        		  System.out.println("Placa");
      		      String placaI=lector.nextLine();
      		    System.out.println("Kilometraje");
      		  int kilomI=lector.nextInt();
        		  
        		  
        		  System.out.println("#################################");
           	   
        		  System.out.println("Codigo de importacion");
        		   int codigo=lector.nextInt();
        		   System.out.println("Valor de la importacion");
        		   int valor=lector.nextInt();
        		   
        		   
        	   }
        	   
           }else if(opcion==2) {
        	   System.out.println("Ingrese numero de placa del auto");
        	   int placaAuto=lector.nextInt();
        	    
        	   Auto auto1=new  Auto();
        	   auto1.setMarca("Chebrolet");
        	   auto1.setModelo("Soport");
        	   auto1.setPlaca(1234);
        	   auto1.setKilometraje(5555);
        	   
        	   Auto auto2=new  Auto();
        	   auto2.setMarca("toyota");
        	   auto2.setModelo("linux");
        	   auto2.setPlaca(4321);
        	   auto2.setKilometraje(5555);
        	   
        	   Auto auto3=new  Auto();
        	   auto3.setMarca("Gran vitara");
        	   auto3.setModelo("Soport");
        	   auto3.setPlaca(1234);
        	   auto3.setKilometraje(5555);
        	   
        	   Auto auto4=new  Auto();
        	   auto4.setMarca("Chebrolet");
        	   auto4.setModelo("Soport");
        	   auto4.setPlaca(765);
        	   auto4.setKilometraje(5555);
        	   
        	   Auto auto5=new  Auto();
        	   auto5.setMarca("Chebrolet");
        	   auto5.setModelo("Soport");
        	   auto5.setPlaca(1444);
        	   auto5.setKilometraje(5555);
        	   
        	   Auto auto6=new  Auto();
        	   auto6.setMarca("Chebrolet");
        	   auto6.setModelo("Soportage");
        	   auto6.setPlaca(1234);
        	   auto6.setKilometraje(5555);
        	   
        	   Auto auto7=new  Auto();
        	   auto7.setMarca("4 x 4");
        	   auto7.setModelo("prius");
        	   auto7.setPlaca(1234);
        	   auto7.setKilometraje(5555);
        	   
        	   Auto auto8=new  Auto();
        	   auto8.setMarca("KIA");
        	   auto8.setModelo("Soport");
        	   auto8.setPlaca(1234);
        	   auto8.setKilometraje(5555);
        	   
        	   Auto buscqueda[] = new Auto[10];
        	   buscqueda[0] = auto1;
        	   buscqueda[1] = auto2;
        	   buscqueda[2] = auto3;
        	   buscqueda[3] = auto4;
        	   buscqueda[4] = auto5;
        	   buscqueda[5] = auto6;
        	   buscqueda[6] = auto7;
        	   buscqueda[7] = auto8;
				
        	   for (int i = 0; i < buscqueda.length; i++) {
					Auto libro = buscqueda[i];


					boolean buscar = false;
					if (buscar == true) {
						System.out.println(buscqueda[i]);

					}
        	   }
        	   
           }
		    
		    
		}while(opcion ==5);
		System.out.println("Gracias por preferirnos");
	}

}
