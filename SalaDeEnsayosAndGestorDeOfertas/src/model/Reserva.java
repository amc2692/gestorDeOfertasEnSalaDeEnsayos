package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Reserva implements Serializable, Comparable<Reserva>{

	private static final long serialVersionUID = 2L;
	private String nombreBanda;
	private int horaDesde;
	private int horaHasta;
	private double monto;
	private LocalDate fechaReserva;
	
	
	public Reserva(String nombreBanda, int horaDesde, int horaHasta, double monto, LocalDate fechaReserva) {
		this.nombreBanda = nombreBanda;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.monto =  monto;
		this.fechaReserva = fechaReserva;
	
	}
	


	
	public String getNombreBanda() {
		return nombreBanda;
	}
	public int getHoraDesde() {
		return horaDesde;
	}
	public int getHoraHasta() {
		return horaHasta;
	}
	public double getMonto() {
		return monto;
	}
	
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nombreBanda +"\n");
		sb.append("de: " + horaDesde + " a " + horaHasta + "\n");
		sb.append(monto+ "\n-------------");
		return sb.toString();
	}




	@Override
	public int compareTo(Reserva other) {
		return (int) (this.getMonto() - other.getMonto());
	}
	
}

