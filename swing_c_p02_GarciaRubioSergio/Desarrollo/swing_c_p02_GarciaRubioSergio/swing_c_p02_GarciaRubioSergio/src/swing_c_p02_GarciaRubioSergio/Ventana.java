/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-Ventana.java
 * 21 nov 2022 9:20:28
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;





/**
 * @author Sergio
 *
 */
public class Ventana extends JFrame implements ActionListener {

	/** The ancho ventana. */
	private int anchoVentana;
	/** The alto ventana. */
	private int altoVentana;
	private JMenuBar miBarra;
	private JMenu archivo, registro, ayuda;
	private JMenuItem salir, alta, baja, acerca;   
    private JPanel miPanel1;
    private Ventana miVentanaPrincipal;
    private PanelShowMessageBotonBaja psmd;
    private PanelShowMessageAcercaDe mAcerca;
	/**
	 * Instantiates a new ventana.
	 */
	public Ventana() {

		super();
		this.setTitle("Gestión Hotel_GarciaRubioSergio");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// usamos toolkit
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamagnoPantalla = miPantalla.getScreenSize();
		// obtenemos el ancho y alto de la pantalla y lo guardamos
		int altoPantalla = tamagnoPantalla.height;
		int anchoPantalla = tamagnoPantalla.width;

		// vamos a crear un marco que tenga la mitad de mi pantalla +40 de altura para
		// que encuadre bien
		this.setSize(anchoPantalla / 2, altoPantalla / 2 + 40);
		

		// guardo el valor
		anchoVentana = anchoPantalla / 2;
		altoVentana = altoPantalla / 2;
		// en el centro de la pantalla
		this.setLocation(anchoPantalla / 4, altoPantalla / 4);
		
		// almacenamos el icono en una variable de clase imagen, son dos GG para ser anagrama de gestion y garcía
		// Anagrama
		Image miIcono = miPantalla.getImage(getClass().getResource("Recursos/logo3.jpg"));
		// establece esta imagen como icono
		this.setIconImage(miIcono);

		// funcion que inicia los componentes
		iniciarComponentes();
		registro.setMnemonic(KeyEvent.VK_R);
		// funcion para añadir componentes
		anadirComopontenes();
		
		//Listeners
		PanelBotones.btnAlta.addActionListener(this);
		PanelBotones.btnBaja.addActionListener(this);
		baja.addActionListener(this);
		acerca.addActionListener(this);
		salir.addActionListener(this);
		// al final lo hacemos visible
		this.setVisible(true);
	}

	// Funcion que inicia los componentes
	private void iniciarComponentes() {
        miPanel1 = new PanelBotones();        
		miBarra = new JMenuBar();
		archivo = new JMenu("Archivo");
		registro = new JMenu("Registro");
		ayuda = new JMenu("Ayuda");
		salir = new JMenuItem("Salir");
		alta = new JMenuItem("Alta Registro");
		baja = new JMenuItem("baja Registro");
		acerca = new JMenuItem("Acerca de...");
		

	}

	// Funcion que añade los componentes
	private void anadirComopontenes() {
		// Menubar
		this.setJMenuBar(miBarra);
		// Menubar
		this.setJMenuBar(miBarra);
		// Jmenu
		miBarra.add(archivo);
		miBarra.add(registro);
		miBarra.add(ayuda);

		// MenuItem
		registro.add(alta);
		registro.add(baja);
		archivo.add(salir);
		ayuda.add(acerca);
		
		//componentes panel
		this.add(miPanel1,BorderLayout.CENTER);
	
	}
	public void setVentanaPrincipal(Ventana miVentana) {
		miVentanaPrincipal = miVentana;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == PanelBotones.btnAlta) {
			VentanaDialogo miVentanaDialogo = new VentanaDialogo(miVentanaPrincipal, true);
			miVentanaDialogo.setVisible(true);
			
		} 
		if (e.getSource() == PanelBotones.btnBaja || e.getSource() == baja ) {
			psmd = new PanelShowMessageBotonBaja();
			this.add(psmd);
			
		} 
		if (e.getSource() == acerca) {
			mAcerca= new PanelShowMessageAcercaDe();
			this.add(mAcerca);
			
		} 
		if (e.getSource() == salir) {
			System.exit(0);
			
		} 
	}
}