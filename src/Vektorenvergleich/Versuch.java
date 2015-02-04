package Vektorenvergleich;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Versuch {
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {
		try {
			ArrayList<String> liste = new ArrayList<String>();
			// Liste erstellen
			System.out.println("Vergleichen und Sortieren von Vektoren.");
			System.out.println("End with exit!");
			for (int i = -1; i < 0; i--) {
				BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Suchanfrage" + i * -1 + ": ");
				String Eingabe = console.readLine();

				liste.add(Eingabe);
				// Listen Eingabe
				if (Eingabe.contains("exit")) {
					liste.remove("exit");
					
					break;
				}
			}
			Versuch http = new Versuch();
			// gleicher Name wie die Class
			System.out.println("");
			http.sendGet(liste);
		} catch (IOException e) {
			e.printStackTrace();
			/* Eingabe zuende */}
	}

	// HTTP GET request
	private void sendGet(ArrayList<String> liste) throws Exception {

		double max = 0;
		System.out.println("last = greatest");
		//Verschachtelte Schleifen zur Abfrage
		for (String e1 : liste) {
			for (String e2 : liste) {
				if (e1 != e2) {

					String url = "http://vmdeb20.deri.ie:8890/esaservice?task=esa&term1=" + e1 + "&term2=" + e2;
					// HTTP-Code mit Wörtern eingebunden
					URL obj = new URL(url);
					HttpURLConnection con = (HttpURLConnection) obj.openConnection();

					// optional default is GET
					con.setRequestMethod("GET");

					// add request header
					con.setRequestProperty("User-Agent", USER_AGENT);

					BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
					String inputLine;
					StringBuffer response = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						response.append(inputLine);
					}
					in.close();

					double W = Double.parseDouble(response.toString().replaceAll("\"", ""));

                                        //sortieren der Vektoren 
					if (W > max) {
						max = W;
						System.out.println(e1 + " " + e2 + " : " + W);
					}
				}
			}
		}

	}

}
