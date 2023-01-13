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
public class PanelShowMessageFotos3 extends JPanel {
	 private MiIcon3 icon;
	public PanelShowMessageFotos3() {
		MiIcon3 icon = new MiIcon3();
		JOptionPane.showMessageDialog(null, "", "FOTO DE LA HABITACION 3",
				JOptionPane.DEFAULT_OPTION, icon);
		

	}
}
