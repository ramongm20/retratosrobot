
import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Retrato miRetrato = new Retrato();
		for (int rasgo=0; rasgo<Retrato.getNumRasgos(); rasgo++) {
			System.out.println(Retrato.obtenerOpciones(rasgo));
			int opcion = in.nextInt();
			while (opcion < 1 || opcion > (Retrato.getNumOpciones(rasgo) - 1)) {
				System.out.println("Opción incorrecta");
				opcion = in.nextInt();
			} // cierra while
			miRetrato.setRasgo(rasgo, opcion);
		} // for i
		System.out.println(miRetrato);
	} // cierra main

}