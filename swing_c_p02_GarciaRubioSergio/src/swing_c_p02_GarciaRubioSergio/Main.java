/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-Main.java
 * 21 nov 2022 9:20:05
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;



/**
 * @author Sergio
 *
 */
public class Main {
	public static void main(String[] args) {
		Ventana miVentana; 
		VentanaDialogo miVentanaD;
		miVentana= new Ventana();
		miVentana.setVentanaPrincipal(miVentana);
        miVentana.setVisible(true);
	}
}
