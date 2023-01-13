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
public class PanelShowMessageFotos2 extends JPanel {
	 private MiIcon2 icon;
	public PanelShowMessageFotos2() {
		MiIcon2 icon = new MiIcon2();
		JOptionPane.showMessageDialog(null, "", "FOTO DE LA HABITACION 2",
				JOptionPane.DEFAULT_OPTION, icon);
		

	}
}
