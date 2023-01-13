/**
 * Panel5.java
   26 nov 2022 4:50:56
   @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * @author sergio
 *
 */
public class Panel5 extends JPanel implements ActionListener {
	private JButton nuevo, guardar;
	private JToggleButton imprimir; // Componente extra qu no se utilizaba, lo usare para volver a quitar el panel
									// 4(JTabbedPane) que se queda en mitad del paisaje
	private PanelShowMessageGuardar psmg;
	private PanelShowMessageRellenaCampos psmr;
	private boolean bandera = true;
	private ImageIcon imImprimir, imNuevo, imGuardar;

	public Panel5() {
		crearComponentes();
		anadirComponentes();
		Color color1 = new Color(11, 1, 97);// color azul oscuro
		imprimir.setBackground(Color.yellow);
		nuevo.setBackground(Color.yellow);
		guardar.setBackground(Color.yellow);

		this.setOpaque(false);
	}

	public void crearComponentes() {
		// imagenes
		imImprimir = new ImageIcon(getClass().getResource("Recursos/imprimir.jpg"));
		imNuevo = new ImageIcon(getClass().getResource("Recursos/basura.jpg"));
		imGuardar = new ImageIcon(getClass().getResource("Recursos/guardar.jpg"));
		// boton extra
		// Uso JToggleButton como componente extra que no se usa en la tarea
		imprimir = new JToggleButton("Imprimir", imImprimir);
		imprimir.setToolTipText(" muestra y esconde el TabbedPane ");

		imprimir.addActionListener(this);
		// botones
		nuevo = new JButton("Nuevo", imNuevo);
		nuevo.addActionListener(this);
		guardar = new JButton("Guardar", imGuardar);
		guardar.addActionListener(this);
	}

	public void anadirComponentes() {

		this.add(imprimir);
		this.add(nuevo);
		this.add(guardar);
	}

	public void nuevoRegistro() {
		Panel2.cajaDeTextoUsuario.setText("");
		Panel2.cajaApellidos.setText("");
		Panel2.cajaDeTelefonos.setText("");
		Panel2.cajaDni.setText("");
		Panel2.cajaDni.setText("");
		Panel3.combo.setSelectedItem("Simple");
		Panel3.spnHabi.setValue(0);
		Panel3.cbninios.setSelected(false);
		Panel3.spEdad.setValue(0);
		Panel3.cajaexNinios.setText("");
		Panel3.cajaimHabit.setText("");
		Panel2.cajaNumeroDias.setText("1");
		// para las fechas vuelvo a meterles el día actual y mañana
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		String hoy = today.toString();
		String manana = tomorrow.toString();
		Panel2.cajaFechaSalida.setText(manana);
		Panel2.cajaFechaEntrada.setText(hoy);
		// oculto el panel 4
		Panel4.datos.setVisible(false);
		bandera = true;
	}

	public void validarGuardarCampos() {
		// SI algun campo de datos cliente que considero los obligatarios esta vacios
		// manda un mensaje de alerta
		if (Panel2.cajaDeTextoUsuario.getText().trim().equals("")

				|| Panel2.cajaApellidos.getText().trim().equals("")

						| Panel2.cajaDeTelefonos.getText().trim().equals("")

						| Panel2.cajaDni.getText().trim().equals("")

						| Panel2.cajaFechaEntrada.getText().trim().equals("")

						| Panel2.cajaFechaSalida.getText().trim().equals("")

						| Panel2.cajaNumeroDias.getText().trim().equals("")) {

			psmr = new PanelShowMessageRellenaCampos();
			this.add(psmr);
			// si estan todo rellenos los puede guardar
		} else {
			psmg = new PanelShowMessageGuardar();
			this.add(psmg);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// boton guardar
				if (e.getSource() == guardar) {
					validarGuardarCampos();

				}
				if (e.getSource() == nuevo) {

					nuevoRegistro();

				}
		// al pulsar imprimir aparecen el panel4 con los datos
		if (e.getSource() == imprimir && bandera == true) {

			Panel4.datos.setVisible(true);

			// guardar datos en datos clientes
			String datosClientes = "Nombre: " + Panel2.cajaDeTextoUsuario.getText() + "\n Apellidos: "
					+ Panel2.cajaApellidos.getText() + "\n Telefono:" + Panel2.cajaDeTelefonos.getText() + "\n DNI: "
					+ Panel2.cajaDni.getText() + "\n Fecha de entrada: " + Panel2.cajaFechaEntrada.getText()
					+ "\n Fecha de salida: " + Panel2.cajaFechaSalida.getText() + "\n Días de estancia:"
					+ Panel2.cajaNumeroDias.getText();

			Panel4.Texto1.setText(datosClientes);
			String datoshabitacion = "Tipo de habitación: " + (String) Panel3.combo.getSelectedItem()
					+ "\n Habitaciones reservadas:" + Panel3.spnHabi.getValue();
			if (Panel3.cbninios.isSelected()) {
				datoshabitacion += "\n Tienen hijos de: " + Panel3.spEdad.getValue() + " Años \n Extra: "
						+ Panel3.cajaexNinios.getText();
			}
			datoshabitacion += "\n Importe Total: " + Panel3.cajaimHabit.getText();
			Panel4.Texto2.setText(datoshabitacion);
			bandera = false;
		} else if (e.getSource() == imprimir && bandera == false) {
			Panel4.datos.setVisible(false);
			bandera = true;
		}
		

	}
}
