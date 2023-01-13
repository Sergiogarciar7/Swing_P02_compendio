/**
 * Panel.java
   24 nov 2022 21:39:40
   @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.text.MaskFormatter;

/**
 * @author sergio
 *
 */

public class Panel2 extends JPanel implements FocusListener {
	// declaramos los objetos
	private JLabel lbUsuario;
	private JLabel lbDNI;
	private JLabel lbApellidos;
	private JLabel lbTelefono;
	private JLabel fechaEntrada;
	private JLabel fechaSalida;
	private JLabel difDias;
	private String dias;
	protected static JTextField cajaDeTextoUsuario, cajaApellidos, cajaNumeroDias;
	protected static JFormattedTextField cajaDeTelefonos, cajaDni, cajaFechaEntrada, cajaFechaSalida;

	private MaskFormatter mascara1;
	private MaskFormatter mascara2;

	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints; // constraints of this layout
   
	public Panel2() {
		JPanel p22 = new JPanel();

		layout = new GridBagLayout();
		JLabel nombre = new JLabel("FORMULARIO RESERVA");
		nombre.setFont(new Font("Ink Free", Font.PLAIN, 24));

		Color color1 = new Color(11, 1, 97);
		nombre.setForeground(color1);
		p22.add(nombre);
		p22.setBackground(Color.yellow);
		this.add(p22);
		this.setLayout(layout); // set frame layout
		constraints = new GridBagConstraints(); // instantiate constraints
		this.setOpaque(false);
		// instancio los componentes
		lbUsuario = new JLabel();
		lbUsuario.setText("NOMBRE");

		lbUsuario.setForeground(Color.yellow);
		// Para centros los campos
		lbUsuario.setHorizontalAlignment(JTextField.CENTER);
		// mascara que usare para la caja de usuario
		cajaDeTextoUsuario = new JTextField();		
		cajaDeTextoUsuario.setHorizontalAlignment(JTextField.CENTER);
		cajaApellidos = new JTextField();
		cajaApellidos.setHorizontalAlignment(JTextField.CENTER);
		// Apellido
		lbApellidos = new JLabel("APELLIDOS");
		lbApellidos.setForeground(Color.yellow);
		lbApellidos.setHorizontalAlignment(JTextField.CENTER);

		// telefonos
		lbTelefono = new JLabel("TELÉFONO");
		lbTelefono.setForeground(Color.yellow);
		lbTelefono.setHorizontalAlignment(JTextField.CENTER);
		// caja qu usare para poner solo 9 digitos en tlf
		try {
			mascara2 = new MaskFormatter("######### ");
			cajaDeTelefonos = new JFormattedTextField(mascara2);
			// para validarlo antimaticamente
			cajaDeTelefonos.setFocusLostBehavior(cajaDeTelefonos.COMMIT);
			cajaDeTelefonos.setToolTipText(" Añade 9 Digitos ");
			cajaDeTelefonos.setHorizontalAlignment(JTextField.CENTER);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// DNI
		lbDNI = new JLabel("DNI");
		lbDNI.setForeground(Color.yellow);
		lbDNI.setHorizontalAlignment(JTextField.CENTER);
		// caja que usare para poner solo 8 digitos y una letra
		try {
			mascara1 = new MaskFormatter("########U ");
			cajaDni = new JFormattedTextField(mascara1);
			// para validarlo antimaticamente
			cajaDni.setFocusLostBehavior(cajaDeTelefonos.COMMIT);
			cajaDni.setToolTipText(" Añade 8 Digitos y una letra, ej: 00000000A ");;
			cajaDni.setHorizontalAlignment(JTextField.CENTER);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// fecha entrada
		fechaEntrada = new JLabel("FECHA DE ENTRADA");
		fechaEntrada.setHorizontalAlignment(JTextField.CENTER);
		fechaEntrada.setForeground(Color.yellow);
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		cajaFechaEntrada = new JFormattedTextField();
		cajaFechaEntrada.setHorizontalAlignment(JTextField.CENTER);
        //Fecha salida
		fechaSalida = new JLabel("FECHA DE SALIDA");
		fechaSalida.setForeground(Color.yellow);
		fechaSalida.setHorizontalAlignment(JTextField.CENTER);
		
		
		
		cajaFechaSalida = new JFormattedTextField();
		cajaFechaSalida.setHorizontalAlignment(JTextField.CENTER);
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		
		String hoy = today.toString();
		

		// Get day from date
		String manana = tomorrow.toString();

		cajaFechaSalida.setText(manana);
		cajaFechaEntrada.setText(hoy);
	
		// dias de estancia
		difDias = new JLabel("Días de estancia");
		difDias.setHorizontalAlignment(JTextField.CENTER);
		difDias.setForeground(Color.yellow);
		cajaNumeroDias = new JFormattedTextField();
		cajaNumeroDias.setHorizontalAlignment(JTextField.CENTER);

		// listerens
		cajaNumeroDias.addFocusListener(this);
		cajaFechaSalida.addFocusListener(this);
		cajaFechaEntrada.addFocusListener(this);
		long diff = ChronoUnit.DAYS.between(today, tomorrow);

		dias = String.valueOf(diff);
		cajaNumeroDias.setText(dias);
		cajaNumeroDias.setEditable(false);
//		//Creamos un Insets
		Insets insert = new Insets(0, 1, 1, 1);

		// constrains
		constraints = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(lbUsuario, constraints); // set constraints

		this.add(lbUsuario); // add component

		constraints = new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(cajaDeTextoUsuario, constraints); // set constraints
		this.add(cajaDeTextoUsuario); // add component

		// contraseña
		constraints = new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(lbApellidos, constraints); // set constraints

		this.add(lbApellidos); // add component

		constraints = new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(cajaApellidos, constraints); // set constraints
		this.add(cajaApellidos); // add component

		// telefono
		constraints = new GridBagConstraints(0, 5, 1, 1, 1, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(lbTelefono, constraints); // set constraints

		this.add(lbTelefono); // add component

		constraints = new GridBagConstraints(0, 6, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(cajaDeTelefonos, constraints); // set constraints
		this.add(cajaDeTelefonos); // add component
		// DNI
		constraints = new GridBagConstraints(0, 7, 1, 1, 1, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(lbDNI, constraints); // set constraints

		this.add(lbDNI); // add component

		constraints = new GridBagConstraints(0, 8, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 300, 0);

		layout.setConstraints(cajaDni, constraints); // set constraints
		this.add(cajaDni); // add component

		// Fecha entrada
		constraints = new GridBagConstraints(0, 9, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(fechaEntrada, constraints); // set constraints
		this.add(fechaEntrada); // add component

		constraints = new GridBagConstraints(0, 10, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);

		layout.setConstraints(cajaFechaEntrada, constraints); // set constraints
		this.add(cajaFechaEntrada); // add component
		// Fecha salida
		constraints = new GridBagConstraints(0, 11, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);

		layout.setConstraints(fechaSalida, constraints); // set constraints
		this.add(fechaSalida); // add component

		constraints = new GridBagConstraints(0, 12, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);

		layout.setConstraints(cajaFechaSalida, constraints); // set constraints
		this.add(cajaFechaSalida); // add component

		// Diferencia de dias
		constraints = new GridBagConstraints(0, 13, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);

		layout.setConstraints(difDias, constraints); // set constraints
		this.add(difDias); // add component

		constraints = new GridBagConstraints(0, 14, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);

		layout.setConstraints(cajaNumeroDias, constraints); // set constraints
		this.add(cajaNumeroDias); // add component
	}

	@Override
	public void focusGained(FocusEvent e) {
		LocalDate fecha1 = LocalDate.parse(cajaFechaEntrada.getText(), DateTimeFormatter.ISO_DATE);
		LocalDate fecha2 = LocalDate.parse(cajaFechaSalida.getText(), DateTimeFormatter.ISO_DATE);

		long diff = ChronoUnit.DAYS.between(fecha1, fecha2);
		String dia = String.valueOf(diff);
		cajaNumeroDias.setText(dia);

	}

	@Override
	public void focusLost(FocusEvent e) {
		LocalDate fecha1 = LocalDate.parse(cajaFechaEntrada.getText(), DateTimeFormatter.ISO_DATE);
		LocalDate fecha2 = LocalDate.parse(cajaFechaSalida.getText(), DateTimeFormatter.ISO_DATE);

		long diff = ChronoUnit.DAYS.between(fecha1, fecha2);
		String dia = String.valueOf(diff);
		cajaNumeroDias.setText(dia);

	}

}
