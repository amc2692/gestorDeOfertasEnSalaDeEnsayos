package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;

public class SalaEnsayos implements Serializable{
	
	private static final long serialVersionUID = 2L;
	private HashMap<String, Reserva> listaDeReservas;
	
	public SalaEnsayos() {
		listaDeReservas = new HashMap<String, Reserva>();
	}
	
	public void registrarReserva(String nombreBanda, int horaDesde, int horaHasta, double monto, LocalDate fechaReserva){
		if(listaDeReservas.containsKey(nombreBanda)) {
			throw new RuntimeException("La banda ya se encuentra en la lista de reservas");
		}
		else {
			Reserva nuevaReserva = new Reserva(nombreBanda, horaDesde, horaHasta, monto, fechaReserva);
			listaDeReservas.put(nombreBanda, nuevaReserva);
		}
	}
	
	public void printReservas() {
		for(String s: listaDeReservas.keySet()) {
			System.out.println(listaDeReservas.get(s));
		}
	}

	public HashMap<String, Reserva> getListaDeReservas() {
		return listaDeReservas;
	}
	
	public Reserva getReserva(String nombreBanda) {
		return listaDeReservas.get(nombreBanda);
	}
	
	
	/*
	public void setearReservasDePrueba() {
		
		registrarReserva(null, "Tesseract", 7, 10, 16000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Periphery", 8, 12, 20000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Vola", 10, 17, 13000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Tool", 11, 17, 21000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Bring Me The Horizon", 0, 4, 15000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Fit For An autopsy", 13, 17, 17000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Jinjer", 17, 19, 16000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Mudvayne", 15, 22, 13000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Thy Art Is Murder", 20, 23, 11100, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Slipknot", 2, 4, 13000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Rammstein", 2, 5, 17000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Trivium", 1, 4, 13000, LocalDate.of(2024, 10, 23));
		registrarReserva(null, "Soil", 5, 10, 11000, LocalDate.of(2024, 10, 23));
	
	}
	*/
	
}
