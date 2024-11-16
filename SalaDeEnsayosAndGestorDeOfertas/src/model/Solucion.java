package model;

import java.util.ArrayList;
import java.util.HashSet;

public class Solucion implements Comparable<Solucion> {
	private ArrayList<Reserva> arregloDeReservas;
	private double montoTotal = 0;
	
	public Solucion(ArrayList<Reserva> arregloDeReservas) {
		this.arregloDeReservas = arregloDeReservas;
		montoTotal = calcularMontoTotal();
	}

	
	@Override
	public int compareTo(Solucion other) {
		return (int) (montoTotal - other.getMontoTotal());
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public ArrayList<Reserva> getArregloDeReservas() {
		return arregloDeReservas;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Reserva r: arregloDeReservas) {
			if(r == null) {
				sb.append("### -");
			}
			else {
				sb.append(r.getNombreBanda() + " - ");
			}
		}
		sb.append("\n" + montoTotal);
		return sb.toString();
	}
	
	public double calcularMontoTotal() {
		HashSet<Reserva> reservas = new HashSet<Reserva>();
		double m = 0;
		for(Reserva r : arregloDeReservas) {
			reservas.add(r);
		}
		for(Reserva r : reservas) {
			if(r != null) {
				m += r.getMonto();
			}
		}
		return m;
	}	
	
	
}
