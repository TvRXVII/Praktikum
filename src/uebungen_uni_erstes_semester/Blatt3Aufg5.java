package uebungen_uni_erstes_semester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blatt3Aufg5 {

	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Binärzahl: ");
			String Eingabe = console.readLine();
			// Array anlegen das so groß ist wie deine zahl lang
			int[] zahlen = new int[Eingabe.length()];

			// Zahlen in ein Array einfügen
			for (int i = zahlen.length - 1; i >= 0; i--) {
				zahlen[zahlen.length - 1 - i] = Integer.parseInt(String.valueOf(Eingabe.charAt(i)));
				// System.out.println(zahlen[i]);
			}
			double sum = 0;
			for (int i = 0; i < zahlen.length; i++) {

				double Dezimal = Math.pow(2, i) * zahlen[i];
				sum = sum + Dezimal;
				// String A = String.valueOf(Dezimal);
				// int B;
				// B = Integer.parseInt(A);
				// String C = String.valueOf(zahl);
				// int D;
				// D = Integer.parseInt(C);
				// int Ausgabe = B * D;

			}

			System.out.println("Dezimalzahl: " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}