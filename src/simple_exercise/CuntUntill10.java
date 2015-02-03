package simple_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuntUntill10 {

	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Eingabe: ");
			String Zeile = console.readLine();

			int Eingabe = Integer.parseInt(Zeile);
			if (Eingabe > 10) {
				for (int i = 0; i <= Eingabe - 10; i++) {
					System.out.println(Eingabe - i);
				}

			} else {
				for (int i = 0; i <= 10 - Eingabe; i++) {
					System.out.println(Eingabe + i);
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
