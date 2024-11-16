package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Solver {
	
	static Random rand;
	static ArrayList<String> bandasRegistradas;
	static Solucion solucion;
	static ArrayList<Reserva> arrayDeReservasSolucion;
	static ArrayList<Solucion> conjuntoSolucionReserva;

	
	
	
	//SI EL HORARIO ESTA LIBRE, REGISTRA LA BANDA EN EL HORARIO QUE PIDIO
	public static void crearPosibleSolucion(Reserva reserva) {
		if(horarioEstaLibre(reserva) && !arrayDeReservasSolucion.contains(reserva)) {
			for(int i = reserva.getHoraDesde(); i < reserva.getHoraHasta(); i++) {
				arrayDeReservasSolucion.set(i, reserva);
			}
		}
	}
	
	//VERIFICA QUE EL HORARIO DE RESERVA PEDIDO NO ESTE OCUPADO
	public static boolean horarioEstaLibre(Reserva reserva) {
		boolean flag = true;
		for(int i = reserva.getHoraDesde(); i< reserva.getHoraHasta()-1; i++){
			flag &= arrayDeReservasSolucion.get(i) == null;
		}
		return flag;
	}
	

	private static void inicializarArrayDeReservas() {
		arrayDeReservasSolucion = new ArrayList<Reserva>(24);
		for(int i = 0; i < 24; i++) {
			arrayDeReservasSolucion.add(null);
		}
	}

	//CONTROLAR ESTE METODO
	private static void crearConjuntoDeSoluciones(SalaEnsayos sala){
		inicializar();
		crearConjuntoDeSolucionesPosibles(sala);
	}

	private static void crearConjuntoDeSolucionesPosibles(SalaEnsayos sala) {
		while(conjuntoSolucionReserva.size() < 1000) {
			crearArrayDeBandas(sala.getListaDeReservas());
			inicializarArrayDeReservas();
			while(0 < bandasRegistradas.size()) {
				String banda = bandasRegistradas.get(rand.nextInt(bandasRegistradas.size()));
				crearPosibleSolucion(sala.getListaDeReservas().get(banda));
				bandasRegistradas.remove(banda);
			}
			agregarSolucionToConjuntoSolucionReserva(sala);
		}
	}
	
	
	private static void crearArrayDeBandas(HashMap<String, Reserva> listaReservas) {
		for(String s : listaReservas.keySet()) {
			bandasRegistradas.add(s);
		}
	}

	private static void inicializar() {
		bandasRegistradas = new ArrayList<String>();
		rand = new Random();
		conjuntoSolucionReserva = new ArrayList<Solucion>();
		
	}
	
	private static void agregarSolucionToConjuntoSolucionReserva(SalaEnsayos sala) {
		crearSolucionFromReservas(sala);
	
	}

	private static void crearSolucionFromReservas(SalaEnsayos sala) {
		solucion = new Solucion(arrayDeReservasSolucion);
		conjuntoSolucionReserva.add(solucion);
	}
	
	public static Solucion buscarMejorSolucion(SalaEnsayos sala) {
		crearConjuntoDeSoluciones(sala);
		return conjuntoSolucionReserva.stream().sorted((a, b) -> b.compareTo(a)).toList().get(0);
	}
		
}

