package miercoles;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Bienvenido a Iberia.");
		System.out.println("Por favor, introduzca el nombre.");
		boolean haymaleta = false;
		boolean haymaleta2 = false;
		boolean embalaje = false;
		Maleta2 m2=null;
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		System.out.println("Por favor, introduzca el apellido.");
		String apellido = sc.next();
		Turista turista = new Turista(nombre, apellido);
		System.out.println();
		System.out.println("¿Tiene maleta?");
		haymaleta = sc.nextBoolean();
		if (haymaleta == true) {
			System.out.println("Pose la primera maleta en la cinta");
			double peso1 = sc.nextDouble();
			Maleta1 m1 = new Maleta1("Samsonite", peso1);
			System.out.println("El peso de la " + m1.getMarca() + " es " + peso1 + "kg");
			System.out.println();
			System.out.println();
			System.out.println("¿Tiene otra maleta?");
			haymaleta2 = sc.nextBoolean();
			if (haymaleta2 == true) {
				System.out.println("Pose la siguiente maleta en la cinta");
				double peso2 = sc.nextDouble();
				 m2 = new Maleta2("American Tourister", peso2);
				System.out.println("El peso de la " + m2.getMarca() + " es " + peso2 + "kg");
			}
			System.out.println();
			System.out.println("¿Desea embalar las maletas?");
			embalaje = sc.nextBoolean();
			if(embalaje==true) {
			System.out.println("El incremento de peso es de 0,5kg");
			double incre=0.5;
			turista.setMaleta1(m1);
			turista.setMaleta2(m2);
			System.out.println("El peso total de sus maletas es de " + turista.getSumapeso(incre) + "kg.");
			System.out.println("Check-in realizado. Gracias por confiar en Iberia.");}
			else {turista.setMaleta1(m1);
			turista.setMaleta2(m2);
			System.out.println("El peso total de sus maletas es de " + turista.getSumapeso() + "kg.");
			System.out.println("Check-in realizado. Gracias por confiar en Iberia.");
		} }else
			System.out.println("Check-in realizado. Gracias por confiar en Iberia.");
	}

}
