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
public class PanelShowMessageAcercaDe extends JPanel {

	public PanelShowMessageAcercaDe() {
		JOptionPane.showMessageDialog(null,
				"Aplicación creada por Sergio García Rubio \n Para la Asignatura de Desarrollo de Interfaces \n En segundo de DAM IES AL-ANDALUS"
						+ "\n Se trata de un Hotel situado en el monte de Almería \n El hotel de una estrella y media no es muy bueno pero las vistas son decentes \n Para cualquier duda llamar a la recepción del hotel \n *La recepción del hotel solo estara abierta entre las 10:00 AM y las 11:00 AM* ",
				"Información de la empresa Gestiones de Hotel García Rubio Sergio ", JOptionPane.DEFAULT_OPTION);

	}
}
