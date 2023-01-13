/**
 * SergioClase22_23-jOptionPane-Panel5ShowMessageDialog.java
 * 24 nov 2022 8:45:58
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Sergio
 *
 */
public class PanelShowMessageRellenaCampos extends JPanel {
  
	public PanelShowMessageRellenaCampos() {
		JOptionPane.showMessageDialog(null,"Rellene todos los campos de usuario antes de guardar","Campos Obligatorios vacios",JOptionPane.WARNING_MESSAGE);
		

	}
}
