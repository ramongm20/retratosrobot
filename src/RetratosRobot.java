import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratosRobot {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String pelo = "";
		String pelo1 = "WWWWWWWWW"; 
		String pelo2 = "\\\\\\//////"; 
		String pelo3 = "|\"\"\"\"\"\"\"|";
		String pelo4 = "|||||||||"; 
		String ojos = "";
		String ojos1 = "| O O |"; 
		String ojos2 = "|-(· ·)-|"; 
		String ojos3 = "|-(o o)-|"; 
		String ojos4 = "| \\ / |";
		String orejasYnariz = "";
		String orejasYnariz1 = "@ J @";
		String orejasYnariz2 = "{ \" }"; 
		String orejasYnariz3 = "[ j ]";
		String orejasYnariz4 = "< - >";
		String boca = "";
		String boca1 = "| === |";
		String boca2 = "| - |"; 
		String boca3 = "| ___ |"; 
		String boca4 = "| --- |"; 
		String barbilla = "\\_____/";
		
		
		while (true) {
			System.out.println("NUEVO RETRATO ROBOT\n-----------------------------------------");
			System.out.println("Escoja pelo:");
			System.out.println("1. “WWWWWWWWW”"); 
			System.out.println("2. “\\\\\\//////”"); 
			System.out.println("3. “|\"\"\"\"\"\"\"|”"); 
			System.out.println("4. “|||||||||”"); 
switch (Integer.parseInt(in.readLine())) {
case 1: pelo = pelo1;
case 2: pelo = pelo2;
case 3: pelo = pelo3;
case 4: pelo = pelo4;
} // switch
			System.out.println("Escoja ojos:");
			System.out.println("1. “| O O |”"); 
			System.out.println("2. “|-(· ·)-|”"); 
			System.out.println("3. “|-(o o)-|”"); 
			System.out.println("4. “| \\ / |”");

			switch (Integer.parseInt(in.readLine())) {
			case 1: ojos = ojos1;
			case 2: ojos = ojos2;
			case 3: ojos = ojos3;
			case 4: ojos = ojos4;
			} // switch
			System.out.println("Escoja orejas y nariz:");
			System.out.println("1. “@ J @”"); 
			System.out.println("2. “{ \" }”");
			System.out.println("3. “[ j ]”"); 
			System.out.println("4. “< - >”"); 

			switch (Integer.parseInt(in.readLine())) {
			case 1: orejasYnariz = orejasYnariz1;
			case 2: orejasYnariz = orejasYnariz2;
			case 3: orejasYnariz = orejasYnariz3;
			case 4: orejasYnariz = orejasYnariz4;
			} // switch
System.out.println("Escoja boca:");
			System.out.println("1. “| === |”"); 
			System.out.println("2. “| - |”"); 
			System.out.println("3. “| ___ |”"); 
			System.out.println("4. “| --- |”");
			
			switch (Integer.parseInt(in.readLine())) {
			case 1: boca = boca1;
			case 2: boca = boca2;
			case 3: boca = boca3;
			case 4: boca = boca4;
			} // switch
System.out.println("Este es el retrato\n" + pelo + "\n" + ojos + "\n" + orejasYnariz + "\n" + boca + "\n" + barbilla);

System.out.println("¿Desea configurar un nuevo retrato (s/n)?");
if (in.readLine().charAt(0) == 110) break;
else continue;
		} // while
	} // main
}
