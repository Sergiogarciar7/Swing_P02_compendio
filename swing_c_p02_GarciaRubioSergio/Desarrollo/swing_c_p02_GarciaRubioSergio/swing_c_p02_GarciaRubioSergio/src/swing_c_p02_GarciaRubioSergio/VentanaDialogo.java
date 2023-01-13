/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-ventanaDialogo.java
 * 23 nov 2022 9:00:20
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import java.awt.Toolkit;

import javax.imageio.ImageIO;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Sergio
 *
 */
public class VentanaDialogo extends JDialog {
	private Panel1 paneltitulo;
	private Panel2 panelDatos;
	private Panel3 panelHabitacion;
	private Panel4 panelTexto;
	private Panel5 panelB;
	private Fondo panelFondo;
	private JLabel nombre;

	public VentanaDialogo(Ventana miVentanaPrincipal, boolean modal) {
		super(miVentanaPrincipal, modal);
		this.setTitle("Alta Reservas");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// usamos toolkit
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamagnoPantalla = miPantalla.getScreenSize();
		// obtenemos el ancho y alto de la pantalla y lo guardamos
		int altoPantalla = tamagnoPantalla.height;
		int anchoPantalla = tamagnoPantalla.width;

		// vamos a crear un marco que tenga el tamañode mi pantalla

		this.setSize(anchoPantalla, altoPantalla - 37); // el menos 37 para que no se tape con la barra inferior de la
														// pantalla
		// poner fondo

		panelFondo = new Fondo();
		panelFondo.setLayout(new BorderLayout());
//  setOpaque(true) //para los componentes
		try {
			// Se ajusta la imagen para ser pintada.

			panelFondo.image = ImageIO.read(getClass().getResource("Recursos/fondo5.jpg"));

		} catch (Exception e) {
			// En caso de no poder cargarse, hacer algo más...
			System.out.println(e);
		}

		// Aquí se ajusta el JPanel creado con la imagen pintada en el JFrame
		this.setContentPane(panelFondo);

		// almacenamos el icono en una variable de clase imagen, son dos GG para ser
		// anagrama de gestion y garcía

		Image miIcono = miPantalla.getImage(getClass().getResource("Recursos/logo3.jpg"));
		// establece esta imagen como icono
		this.setIconImage(miIcono);

		// funcion que inicia los componentes
		iniciarComponentes();
//	
//	// funcion para añadir componentes
		anadirComopontenes();

	}

	private void iniciarComponentes() {
		paneltitulo = new Panel1();
		panelDatos = new Panel2();
		panelHabitacion = new Panel3();
		panelTexto = new Panel4();
		panelB = new Panel5();

	}

	private void anadirComopontenes() {
		this.add(paneltitulo, BorderLayout.NORTH);
		this.add(panelDatos, BorderLayout.WEST);
		this.add(panelHabitacion, BorderLayout.EAST);
		this.add(panelTexto, BorderLayout.CENTER);
		this.add(panelB, BorderLayout.SOUTH);
	}
}
