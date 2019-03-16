
import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmosParcial1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//---------------ALGORITMO MERCADO DEL MES------------------------------------
		System.out.println("ALGORITMO: MERCADO DEL MES ");
		System.out.println("Ingresa tu presupuesto");
		int budget=in.nextInt(); //presupuesto para mercado del mes
		System.out.println("Ingresa la cantidad de productos");
		int products=in.nextInt(); //cantidad de productos para el mes

		int []price_products=new int [products];
		System.out.println("Para cada producto ingrese el precio..");
		int total_buy=0;
		for (int i = 0; i < price_products.length; i++) {
			price_products[i]=in.nextInt();
			total_buy+=price_products[i];
		}

		if(total_buy>budget)
			System.out.println("No tienes presupuesto suficiente,\n consigue productos mas baratos o ahorra mas dinero");

		else {
			Arrays.sort(price_products);
			System.out.println("Compra los productos desde \n el mas caro hasta el mas barato:");
			int c=1;
			for (int i = price_products.length-1; i >=0; i--) {
				System.out.println( (c++) +" - $" + price_products[i]);
			}
		}
		
		//----------------ALGORITMO COCTEL FAVORITO------------------------------
		
		
		System.out.println("AlGORITMO: COCTEL FAVORITO");
		System.out.println("Elige el numero de tu coctel favorito:");
		
		String []cocktails=new String[] {"1 - Cosmopolitan","2 - Mojito", "3 - Piña Colada",
				"4 - Tequila Sunrise","5 - Californication"};
		
		for (int i = 0; i < cocktails.length; i++) {
			System.out.println(cocktails[i]);
		}
		
		int k=in.nextInt();
		
		System.out.println(steps_cocktails(k));
		
		//---------------ALGORITMO PARRANDA CON AMIGOS------------------
		System.out.println("ALGORITMO: PARRANDA CON AMIGOS DE LA UNIVERSIDAD");
		System.out.println("Ingresa tu presupuesto");
		
		int p=in.nextInt();
		System.out.println("Ingresa cantidad de amigos");
		int f=in.nextInt();
		int[]friends=new int[f];
		System.out.println("Para cada amigo elige el presupuesto del que dispone");
		int totalP=p;
		for (int i = 0; i < friends.length; i++) {
			friends[i]=in.nextInt();
			totalP+=friends[i];
		}
		System.out.println("El presupuesto total del parche es $"+totalP);
		System.out.println("Elige el sitio de la parranda");
		String []place=new String[] {"1 - Modelia","2 - Calle 85","3 -Calle 51", "4 - Primera de Mayo"};
		for (int i = 0; i < place.length; i++) {
			System.out.println(place[i]);
		}
		int l=in.nextInt();
		if(l==1) {
			if(totalP>=100)
				System.out.println("Tienen presupuesto suficiente para 1 botella");
			else
				System.out.println("No tienen presupuesto suficiente para 1 botella\n"
						+ "Elige otro lugar");
		}
		if(l==2) {
			if(totalP>=150)
				System.out.println("Tienen presupuesto suficiente para 1 botella");
			else
				System.out.println("No tienen presupuesto suficiente para 1 botella\n"
						+ "Elige otro lugar");
		}
		if(l==3) {
			if(totalP>=85)
				System.out.println("Tienen presupuesto suficiente para 1 botella\n");
			else
				System.out.println("No tienen presupuesto suficiente para 1 botella\n"
						+ "Elige otro lugar");
		}
		if(l==4) {
			if(totalP>=65)
				System.out.println("Tienes presupuesto suficiente para 1 botella");
			else
				System.out.println("No tienen presupuesto suficiente para 1 botella\n"
						+ "Elige otro lugar");
		}
		
		//-------------------------ALGORITMO: VIAJE MOCHILERO----------------------
		System.out.println("ALGORITMO: VIAJE MOCHILERO");
		System.out.println("Ingresa el presupuesto");
		int x=in.nextInt();
		System.out.println("Elige una cantidad de ciudades");
		int ci=in.nextInt();
		int []cities=new int[ci];
		System.out.println("Para cada ciudad ingrese un gasto que incluya, hospedaje, "
				+ "comida y transporte");
		int totalB=0;
		for (int i = 0; i < cities.length; i++) {
			cities[i]=in.nextInt();
			totalB+=cities[i];
		}
		if(totalB>x)
			System.out.println("No tienes presupuesto suficiente, ahorra mas dinero o busca ciudades mas baratas");
		else
			System.out.println("Tienes el presupuesto, ¡Disfruta el viaje!");
	
			
			

		
		
	

	}
	
	
	
	
	public static String steps_cocktails(int k) {
		
		if(k==1)
			return "Paso 1: 60ml de Vodka\nPaso 2: 1 Cucharada de licor triple seco"
					+ "\nPaso 3: 2 Cucharadas de zumo de arandanos\n"
					+ "Paso 4: 2 Cucharadas de zumo de limon\nPaso 5: Un trozo de naranja"
					+ "\nPaso 5: Hielo\n¡Sirvelo a tu familia o amigos! ";
		if(k==2)
			return "Paso 1: 2 ramitas de menta o yerbabuena\nPaso 2: 2 Cucharadas de azucar"
					+ "\nPaso 3: El zumo de 1 lima\nPaso 4: 45ml de ron blanco\nPaso 5: Hielo picado"
					+ "\nPaso 6:Soda o agua con gas\n¡Sirvelo a tu familia o amigos!";
		if(k==3)
			return "Paso 1: 1 Parte de ron blanco\nPaso 2: 3 Partes de zumo de piña\nPaso3: "
					+ "1 Parte de leche o crema de coco\nPaso 4: Hielo picado\n¡Sirvelo a tu familia o amigos!";
		if(k==4)
			return "Paso 1: Cubos de hielo\nPaso 2: 60ml de tequila\nPaso 3: 180ml de zumo de naranja"
					+ "\nPaso 4: 1 chorro de granadina\n¡Sirvelo a tu familia o amigos!";
		if(k==5)
			return "Paso 1: 22ml de Vodka\nPaso 2: 22ml de Ginebra\nPaso 3: 22ml de Ron\nPaso 4: "
					+ "22ml de Tequila\nPaso 5: 15ml de Licor de naranja\nPaso 6: Zumo de limon"
					+ "\nPaso 7: Zumo de naranja\n¡Sirvelo a tu familia o amigos!";
		
		return "";
	}




}
