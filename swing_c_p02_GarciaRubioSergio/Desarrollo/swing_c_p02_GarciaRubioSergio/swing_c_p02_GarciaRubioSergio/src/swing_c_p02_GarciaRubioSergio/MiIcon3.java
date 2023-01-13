/**
 * MiIcon.java
   25 nov 2022 23:07:23
   @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;


/**
 * @author sergio 
 *
 */
//Mostrara la foto de la habitacion 2 como un icono en un showmensage
public class MiIcon3 implements Icon{

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		try {
			Image imagen = ImageIO.read(getClass().getResource("Recursos/habitacion3.jpg"));
			g.drawImage(imagen, x, y, c);
			} catch (IOException e) {
				System.out.print("Imagen no encontrada");
			}

		
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 200;
	}

}