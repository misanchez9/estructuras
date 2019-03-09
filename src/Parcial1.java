import java.util.Scanner;

public class Parcial1 {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int n= in.nextInt(); //CANTIDAD DE CONDUCTORES
		int x= in.nextInt(); // CANTIDAD DE RUTAS EN LA MAÑANA
		int y=in.nextInt(); // CATIDAD DE RUTAS EN LA TARDE
		int d= in.nextInt(); //CANTIDAD DE HORAS QUE DEBE TRABAJAR EL CONDUCTOR
		int p=in.nextInt(); //PAGO DE HORA NORMAL
		int p2=in.nextInt(); // PAGO DE HORA EXTRA
		int conductores[]=new int[n];
		int conductoresALaTarde=0;
		int conductoresALaMañana=0;
		while(x>y) {
			 conductoresALaMañana=n/2+(n/4); // SE ENVIA LA MITAD DE LOS CONDUCTORES MAS UN CUARTO
			//DE LA OTRA MITAD
			
			}
		while(x<y) {
			 conductoresALaTarde=n/2+(n/4); //MITAD DE CONDUCTORES MAS UN CUARTO DE LA OTRA MITAD
		}
		//el valor en cada posicion del vector hara referencia a la cantidad de horas trabajadas
		horasTrabajadas(conductores,conductoresALaMañana,conductoresALaTarde);
		
		for(int i=0;i<conductores.length;i++) {
			if(conductores[i]>d) {
				conductores[i]=p2;
				
			}else {
				conductores[i]=p;
			}
		}
		
	}
	
	public static void horasTrabajadas(int[]conductores,int conductoresALaMañana,int 
			conductoresALaTarde) {
		//ACA SE TOMARAN LOS DATOS SUMINISTRADOS POR LA COMPAÑIA O DE LA PERSONA QUE CONTABILIZA LAS HORAS
	
		
	}

}
