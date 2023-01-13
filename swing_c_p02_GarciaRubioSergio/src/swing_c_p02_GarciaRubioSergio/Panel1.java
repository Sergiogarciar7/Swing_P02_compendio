/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-panel1.java
 * 24 nov 2022 13:17:13
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * @author Sergio
 *
 */
public class Panel1 extends JPanel {
	
	private JLabel nombre;
	private ImageIcon imagen1;

	//Constructor de Panel
	public Panel1() {
	this.setLayout(new BorderLayout());
	
	//dentro me creo un layout de tipo box para colocar los elementos.
	  JPanel p2 = new JPanel();
      

	  nombre= new JLabel("Hotel Campito del Lago");
	  
	  Color color1= new Color(11,1,97);
	  nombre.setForeground(color1);
	  
//	  nombre.setFont(new Font("Curlz MT", Font.BOLD | Font.ITALIC, 84));
	  nombre.setHorizontalAlignment(JTextField.CENTER);
	  Map attributes = new Font("Ink Free", Font.BOLD | Font.ITALIC, 84).getAttributes();
	  attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	  nombre.setFont(getFont().deriveFont(attributes));
	  //Poner fondo al titulo
	    
		Fondo panelFondo = new Fondo();
	    panelFondo.setLayout(new FlowLayout());
	//  setOpaque(true) //para los componentes si quiero su fondo
		try {
		    // Se ajusta la imagen para ser pintada.
		    panelFondo.image = ImageIO.read(getClass().getResource("Recursos/fondo2.jpg"));
		    
		} catch (Exception e) {
		    // En caso de no poder cargarse, hacer algo más...
		    System.out.println(e);
		}
//	  this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED));
//	  JLabel fondoTitulo= new JLabel();
	 
	 this.add(nombre);
	this.setOpaque(false);
//	   this.add(panelFondo);
	   
	  

	  
}
}