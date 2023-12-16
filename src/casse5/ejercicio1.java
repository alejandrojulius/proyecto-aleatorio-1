package casse5;

import java.util.Scanner;

public class ejercicio1 {
   //indicar si un año es bisiesto pe
	public static boolean Bisiesto(int anho_actual){
		if (anho_actual % 4 == 0){
			return true;
		}else{
			return false;
		}
	}
	// ingrese los tres lados de un triangulo e indique si existedicho triangulo causa.
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la longitud del lado 1: ");
	        double lado1 = scanner.nextDouble();

	        System.out.println("Ingrese la longitud del lado 2: ");
	        double lado2 = scanner.nextDouble();

	        System.out.println("Ingrese la longitud del lado 3: ");
	        double lado3 = scanner.nextDouble();

	        boolean esTriangulo = verificarTriangulo(lado1, lado2, lado3);

	        if (esTriangulo) {
	            System.out.println("¡El triángulo existe!");
	        } else {
	            System.out.println("El triángulo no existe.");
	        }
	    }

	    public static boolean verificarTriangulo(double lado1, double lado2, double lado3) {
	        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
	    }
	  //* En StarBucks, se aceptan diversos tipos de pago. Si pagas con efectivo no te hacen recargo,

		/* mientras que si pagas con VISA te aumentan el 10% de la cuenta, y si lo haces con

		 MasterCard te recargan el 20%. Construir el método y el caso de prueba. */
		public static double Starbucks (int tipo, double compra){
			double recargo = 0;
			switch(tipo){
			case 0: recargo = 0; break;
			case 1: recargo = 0.10*compra; break;
			case 2: recargo = 0.20*compra; break;
			}
		

		return compra+ recargo;
		/*

		 Kathy organiza una fiesta en la cual una computadora controla el ingreso 

		 mediante 5 CLAVES. Si se ingresa al menos una clave incorrecta ésta 

		 imprimirá “TE EQUIVOCASTE DE FIESTA” y no permitirá el ingreso. Si las 5 

		 claves son correctas imprimirá “BIENVENIDO A LA FIESTA”. Las Claves son:

		1. “TIENES”		2. “QUE SER”

		3. “INVITADO”	       4. “PARA”

		5. “INGRESAR”
	*/
		
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String[] clavesCorrectas = {"TIENES", "QUE SER", "INVITADO", "PARA", "INGRESAR"};

	        int intentos = 0;
	        boolean accesoConcedido = true;

	        System.out.println("Bienvenido al control de acceso de la fiesta de Kathy");

	        while (intentos < 5) {
	            System.out.print("Ingrese la clave " + (intentos + 1) + ": ");
	            String claveIngresada = scanner.nextLine();

	            if (!claveCorrecta(claveIngresada, clavesCorrectas[intentos])) {
	                System.out.println("TE EQUIVOCASTE DE FIESTA");
	                accesoConcedido = false;
	                break;
	            }

	            intentos++;
	        }

	        if (accesoConcedido) {
	            System.out.println("BIENVENIDO A LA FIESTA");
	        }
	    }

	    public static boolean claveCorrecta(String claveIngresada, String claveCorrecta) {
	        return claveIngresada.equals(claveCorrecta);
	    }
		}
		//otra forma
		clave1 = input("Ingrese la clave 1: ")

				if clave1 == "TIENES":

				  clave2 = input("Ingrese la clave 2: ")

				  if clave2 == "QUE SER":

				    clave3 = input("Ingrese la clave 3: ")

				    if clave3 == "INVITADO":

				      clave4 = input("Ingrese la clave 4: ")

				      if clave4 == "PARA":

				        clave5 = input("Ingrese la clave 5: ")

				        if clave5 == "INGRESAR":

				          print("BIENVENIDO A LA FIESTA!!")

				        else:

				          print("TE EQUIVOCASTE DE FIESTA!!")

				      else:

				        print("TE EQUIVOCASTE DE FIESTA!!")

				    else:

				      print("TE EQUIVOCASTE DE FIESTA!!")

				  else:

				    print("TE EQUIVOCASTE DE FIESTA!!")

				else:

				  print("TE EQUIVOCASTE DE FIESTA!!")
}
