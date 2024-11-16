package serializable;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.SalaEnsayos;

public class Lectura {
	
	

		public static SalaEnsayos cargarDatosSalaEnsayos() {
			try(FileInputStream fis = new FileInputStream("datosSalaEnsayos.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {
				
				return (SalaEnsayos) ois.readObject();
				
			} catch (FileNotFoundException e) {
				System.out.println("Lectura: Fichero no encontrado");
				
			} catch (IOException e) {
				System.out.println("Lectura: No se puede acceder al fichero");
				
			} catch (ClassNotFoundException e) {
				System.out.println("Lectura: No se encuentra la clase");
				
			}
			return new SalaEnsayos();
		}
		
	}
	

