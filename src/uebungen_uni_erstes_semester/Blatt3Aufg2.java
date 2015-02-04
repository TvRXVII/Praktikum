package uebungen_uni_erstes_semester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Blatt3Aufg2 {
//sortieren von 4 eingegebenen Zahlen	
	public static void main(String[] args) {

		try {

			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("a=");
			String Zahl1 = console.readLine();

			System.out.println("b=");
			String Zahl2 = console.readLine();

			System.out.println("c=");
			String Zahl3 = console.readLine();

			System.out.println("d=");
			String Zahl4 = console.readLine();

			int Z1 = Integer.parseInt(Zahl1);
			int Z2 = Integer.parseInt(Zahl2);
			int Z3 = Integer.parseInt(Zahl3);
			int Z4 = Integer.parseInt(Zahl4);
			int[] unsorted = { Z1, Z2, Z3, Z4, };
			System.out.println("Unsortiert:");
			System.out.println("-----------");
			for (int i : unsorted) {
				System.out.println(i);
			}
			Arrays.sort(unsorted);
			System.out.println("Sortiert:");
			System.out.println("-----------");
			for (int i : unsorted) {
				System.out.println(i);
			}
		} catch (IOException e) {
			// Sollte eigentlich nie passieren
			e.printStackTrace();
		}
	}

}
