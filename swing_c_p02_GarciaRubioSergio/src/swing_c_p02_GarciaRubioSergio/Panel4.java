/**
 * Panel4.java
   26 nov 2022 0:01:49
   @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;




import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * @author sergio 
 *
 */
public class Panel4 extends JPanel {
	protected static JTabbedPane datos;
	protected static JTextArea Texto1,Texto2;
	private JPanel p1,p2;
 
	public Panel4(){
		crearComponentes();
		anadirComponentes();
		this.setOpaque(false);
	}
	//Intancio compoentes
	public void crearComponentes() {
		datos = new JTabbedPane();	
		Texto1= new JTextArea("Hola");
		Texto2= new JTextArea("Adios");
		p1= new JPanel();
		p2= new JPanel();
  
	}
	public void anadirComponentes() {
		p1.add(Texto1);
		p2.add(Texto2);
		datos.add("Datos Clientes",p1);
		datos.add("Datos Habitacion",p2);

		this.add(datos);	
	
		this.add(datos);
		datos.setVisible(false);
	}
}
