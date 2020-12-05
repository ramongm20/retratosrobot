
import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		String [][] rasgos = {
				{"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"los ojos", "| O   O |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |"},
				{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{"la barbilla", "\\_______/", "\\,,,,,,,/"}
		};
		int [] opciones = new int[rasgos.length];
		for (int i=0; i<rasgos.length; i++)
			opciones[i] = elegirRasgo(rasgos[i]);
		
		System.out.println("El retrato que has creado es:");
		for (int i=0; i<rasgos.length; i++)
			System.out.println(rasgos[i][opciones[i]]);
	}

	static int elegirRasgo(String [] rasgos) {
		int opcion;
		do {
			System.out.println("Elige un rasgo para " + rasgos[0]);
			for (int i=1; i<rasgos.length; i++)
				System.out.println(i + " - " + rasgos[i]);
			opcion = in.nextInt();
			if (opcion < 1 || opcion > rasgos.length)
				System.out.println("Opción incorrecta");
		} while (opcion < 1 || opcion > rasgos.length);
		return opcion;
	}
}
