
public class Retrato {
	private static String [][] rasgos = {
			{"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
			{"los ojos", "| O   O |", "|-(· ·)-|", "|-(o o)-|", "| \\   / |"},
			{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"la barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	private String pelo;
	private String ojos;
	private String nariz;
	private String boca;
	private String barbilla;
	public static int getNumOpciones(int rasgo) {
		return rasgos[rasgo].length;
	} // cierra getNumOpciones
	public static int getNumRasgos() {
		return rasgos.length;
	} // cierra getNumRasgos
	public static String obtenerOpciones(int rasgo) {
		StringBuilder opciones = new StringBuilder("Elige un rasgo para " + rasgos[rasgo][0]);
		for (int i=1; i<rasgos[rasgo].length; i++)
			opciones.append("\n" + i + " - " + rasgos[rasgo][i]);
		return opciones.toString();
	} // cierra obtenerOpciones
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public String getNariz() {
		return nariz;
	}
	public void setNariz(String nariz) {
		this.nariz = nariz;
	}
	public String getBoca() {
		return boca;
	}
	public void setBoca(String boca) {
		this.boca = boca;
	}
	public String getBarbilla() {
		return barbilla;
	}
	public void setBarbilla(String barbilla) {
		this.barbilla = barbilla;
	}
	@Override
	public String toString() {
		return "El retrato que has creado es:\n" + pelo + "\n" + ojos + "\n" + nariz + "\n" + boca + "\n" + barbilla;
	}
	public void setRasgo(int rasgo, int opcion) {
		if (rasgo == 0) setPelo(rasgos[0][opcion]);
		else if (rasgo == 1) setOjos(rasgos[1][opcion]);
		else if (rasgo == 2) setNariz(rasgos[2][opcion]);
		else if (rasgo == 3) setBoca(rasgos[3][opcion]);
		else setBarbilla(rasgos[4][opcion]);
	} // cierra setRasgo
	
	
}
