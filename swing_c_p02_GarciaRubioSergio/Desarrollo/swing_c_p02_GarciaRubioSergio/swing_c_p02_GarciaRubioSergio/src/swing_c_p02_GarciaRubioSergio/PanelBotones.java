/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-panelBotones.java
 * 23 nov 2022 8:22:27
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JPanel;

/**
 * @author Sergio
 *
 */
//Panel que tendra los dos botones de la ventana principal y su funcionalidad.
public class PanelBotones extends JPanel {

	protected static JButton btnAlta, btnBaja;
	private JPanel miPanel, p2;
	private ImageIcon imAlta, imBaja;

	// Constructor de Panel
	public PanelBotones() {
		// Le doy un layout de tipo Border
		this.setLayout(new BorderLayout());

		// dentro me creo un layout de t para colocar los elementos.
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());

		Color color1 = new Color(202, 114, 134);
		p2.setBackground(color1);
		imAlta = new ImageIcon(getClass().getResource("Recursos/alta.jpg"));

		imBaja = new ImageIcon(getClass().getResource("Recursos/baja.jpg"));
		btnAlta = new JButton(" Dar de alta una reserva ", imAlta);
		btnAlta.setBackground(Color.green);
		btnAlta.setToolTipText("Dar de alta una reserva"); // Mostrar mensaje al ponerte sobre el boton
		btnBaja = new JButton("Dar de baja una reserva", imBaja);
		btnBaja.setToolTipText("Dar de baja una reserva");
		btnBaja.setBackground(Color.red);

		btnAlta.setMnemonic(KeyEvent.VK_A); // para asociar el boton con la alt + A
		btnBaja.setMnemonic(KeyEvent.VK_B); // para asociar el boton con la alt + B

		p2.add(btnAlta);
		p2.add(btnBaja);

		// añadimos el 2º layout al primero.
		this.add(p2);

	}

}