package view;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaPrincipal {
	private JFrame frame;
	private JButton buttonSalir;
	private JComboBox<Integer> boxDia;
	private JComboBox<String> boxMes;
	private JComboBox<Integer> boxHoraDesde;
	private JComboBox<Integer> boxHoraHasta;
	private JTextField textNombre;
	private JTextField textMontoReserva;
	private JButton buttonCrearReserva;
	private JButton buttonBuscarMejorSolucion;
	private JTable tablaSoluciones;
	private JTable tablaOfertas;
	private DefaultTableModel modelSoluciones;
	private DefaultTableModel modelOfertas;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JLabel labelMontoSolucion;
	private JLabel labelMonto;
	private JButton buttonBorrarDatos;
	
	public VentanaPrincipal() {
		initialize();
	}


	
	private void initialize() {
		FlatDarculaLaf.setup();
		modelSoluciones = new DefaultTableModel();
		modelOfertas =  new DefaultTableModel();
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		buttonSalir = new JButton("SALIR");
		buttonSalir.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		buttonSalir.setBounds(407, 618, 150, 30);
		frame.getContentPane().add(buttonSalir);
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 139, 77, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		textNombre.setBounds(87, 135, 180, 30);
		textNombre.setColumns(10);
		frame.getContentPane().add(textNombre);
		
		JLabel lblMontoDeReserva = new JLabel("Monto");
		lblMontoDeReserva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblMontoDeReserva.setBounds(10, 173, 77, 28);
		frame.getContentPane().add(lblMontoDeReserva);
		
		textMontoReserva = new JTextField();
		textMontoReserva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		textMontoReserva.setColumns(10);
		textMontoReserva.setBounds(87, 172, 130, 30);
		frame.getContentPane().add(textMontoReserva);
		
		JLabel lblFecha = new JLabel("Fecha de Reserva");
		lblFecha.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblFecha.setBounds(10, 225, 194, 28);
		frame.getContentPane().add(lblFecha);
		
		boxDia = new JComboBox<Integer>();
		boxDia.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		boxDia.setBounds(71, 264, 70, 30);
		frame.getContentPane().add(boxDia);
		
		boxMes = new JComboBox<String>();
		boxMes.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		boxMes.setBounds(216, 268, 110, 30);
		frame.getContentPane().add(boxMes);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblDia.setBounds(24, 264, 37, 28);
		frame.getContentPane().add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblMes.setBounds(167, 264, 37, 28);
		frame.getContentPane().add(lblMes);
		
		JLabel lblHorasAReservar = new JLabel("Horas a Reservar");
		lblHorasAReservar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblHorasAReservar.setBounds(10, 305, 194, 28);
		frame.getContentPane().add(lblHorasAReservar);
		
		boxHoraDesde = new JComboBox<Integer>();
		boxHoraDesde.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		boxHoraDesde.setBounds(71, 344, 70, 30);
		frame.getContentPane().add(boxHoraDesde);
		
		boxHoraHasta = new JComboBox<Integer>();
		boxHoraHasta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		boxHoraHasta.setBounds(216, 344, 70, 30);
		frame.getContentPane().add(boxHoraHasta);
		
		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblDesde.setBounds(10, 344, 65, 28);
		frame.getContentPane().add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		lblHasta.setBounds(151, 344, 55, 28);
		frame.getContentPane().add(lblHasta);
		
		buttonCrearReserva = new JButton("CREAR RESERVA");
		buttonCrearReserva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		buttonCrearReserva.setBounds(43, 387, 300, 30);
		frame.getContentPane().add(buttonCrearReserva);
		
		buttonBuscarMejorSolucion = new JButton("BUSCAR MEJOR SOLUCION");
		buttonBuscarMejorSolucion.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		buttonBuscarMejorSolucion.setBounds(43, 428, 300, 30);
		frame.getContentPane().add(buttonBuscarMejorSolucion);
		
		JPanel panel = new JPanel();
		panel.setBounds(397, 11, 477, 596);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 457, 240);
		panel.add(scrollPane);
		
		tablaOfertas = new JTable();
		scrollPane.setViewportView(tablaOfertas);
		tablaOfertas.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		
		tablaOfertas.setModel(modelOfertas);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 356, 457, 240);
		panel.add(scrollPane_1);
		
		tablaSoluciones = new JTable();
		scrollPane_1.setViewportView(tablaSoluciones);
		tablaSoluciones.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		
		
		tablaSoluciones.setModel(modelSoluciones);
		
		JLabel labelOferas = new JLabel("Ofertas");
		labelOferas.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		labelOferas.setBounds(10, 11, 168, 30);
		panel.add(labelOferas);
		
		JLabel labelSolucion = new JLabel("Mejor Solucion");
		labelSolucion.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		labelSolucion.setBounds(10, 315, 142, 30);
		panel.add(labelSolucion);
		
		labelMontoSolucion = new JLabel("");
		labelMontoSolucion.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		labelMontoSolucion.setBounds(377, 315, 71, 30);
		panel.add(labelMontoSolucion);
		
		labelMonto = new JLabel("Monto mejor solucion");
		labelMonto.setBounds(182, 315, 185, 30);
		panel.add(labelMonto);
		labelMonto.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 22, 319, 70);
		frame.getContentPane().add(panel_1);
		
		buttonBorrarDatos = new JButton("BORRAR DATOS");
		buttonBorrarDatos.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		buttonBorrarDatos.setBounds(604, 618, 270, 30);
		frame.getContentPane().add(buttonBorrarDatos);
		frame.setVisible(true);
	}

	
	
	public JFrame getFrame() {
		return frame;
	}

	public JButton getButtonSalir() {
		return buttonSalir;
	}

	public JComboBox<Integer> getBoxDia() {
		return boxDia;
	}

	public JComboBox<String> getBoxMes() {
		return boxMes;
	}

	public JComboBox<Integer> getBoxHoraDesde() {
		return boxHoraDesde;
	}

	public JComboBox<Integer> getBoxHoraHasta() {
		return boxHoraHasta;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public JTextField getTextMontoReserva() {
		return textMontoReserva;
	}

	public JButton getButtonCrearReserva() {
		return buttonCrearReserva;
	}

	public JButton getButtonBuscarMejorSolucion() {
		return buttonBuscarMejorSolucion;
	}

	public JTable getTablaSoluciones() {
		return tablaSoluciones;
	}

	public JTable getTablaOfertas() {
		return tablaOfertas;
	}

	public DefaultTableModel getModelSoluciones() {
		return modelSoluciones;
	}
	public DefaultTableModel getModelOfertas() {
		return modelOfertas;
	}

	public JLabel getLabelMontoSolucion() {
		return labelMontoSolucion;
	}

	public JButton getButtonBorrarDatos() {
		return buttonBorrarDatos;
	}
	
	
}
