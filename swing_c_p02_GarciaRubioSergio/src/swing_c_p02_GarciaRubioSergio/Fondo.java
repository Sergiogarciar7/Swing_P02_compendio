/**
 * swing_c_p01_parte1_GarciaRubioSergio-swing_c_p01_parte1_GarciaRubioSergio-Contenedor.java
 * 24 nov 2022 13:52:46
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Sergio
 *
 */
//Panel que sera el fondo de la ventaDialogo
public class Fondo extends JPanel {

    public BufferedImage image;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
        	//Lo pone con las dimensiones del contenedor
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
    }
    
}
