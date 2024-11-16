package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.SalaEnsayos;

public class Escritura {
	
	
	
	public static void guardarDatosSalaEnsayos(SalaEnsayos sala) {
		try (FileOutputStream fos = new FileOutputStream("datosSalaEnsayos.txt"); 
			 ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(sala);
			
		} catch (FileNotFoundException e) {
			System.out.println("Escritura: Fichero no encontrado");
		
		} catch (IOException e) {
			System.out.println("Escritura: No se puede acceder al fichero");
		}
		System.out.println("Ok");
		
	}
	
	
	

}
