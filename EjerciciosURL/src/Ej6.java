import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ej6 {

	public static void main(String[] args) {
		
		URL salmantino;
		try {
			salmantino = new URL("https://salmantinocentrocu.wixsite.com/misitio");
			URLConnection salmaConnection = salmantino.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(salmaConnection.getInputStream()));
			File fichero = new File("C:\\prueba\\prueba.txt");
			FileWriter fic = new FileWriter(fichero);
			String cadena;
			while ((cadena = in.readLine()) != null) {
			char[] cad = cadena.toCharArray(); // convierte un string en array de char
		
			for(int i=0;i<cad.length;i++){
				fic.write(cad[i]);
			}
			fic.append("* \n"); // añadimos al final un *
			}
			System.out.println("TERMINADO");
			in.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

