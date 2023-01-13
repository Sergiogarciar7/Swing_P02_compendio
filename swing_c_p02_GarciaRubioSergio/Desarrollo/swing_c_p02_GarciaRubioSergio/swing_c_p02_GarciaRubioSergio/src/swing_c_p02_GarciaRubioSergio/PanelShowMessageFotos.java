/**
 * PanelMessageAcercaDe.java
   24 nov 2022 19:09:48
   @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;


import javax.swing.JOptionPane;
import javax.swing.JPanel;





/**
 * @author sergio 
 *
 */
public class PanelShowMessageFotos extends JPanel {
	 private MiIcon icon;
	public PanelShowMessageFotos() {
		MiIcon icon = new MiIcon();
		JOptionPane.showMessageDialog(null, "", "FOTO DE LA HABITACION 1",
				JOptionPane.DEFAULT_OPTION, icon);
		

	}
}
