/**
 * swing_c_p02_GarciaRubioSergio-swing_c_p02_GarciaRubioSergio-Panel3.java
 * 25 nov 2022 9:56:40
 * @author Sergio García Rubio
 */
package swing_c_p02_GarciaRubioSergio;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Sergio
 *
 */
public class Panel3 extends JPanel implements ActionListener,ChangeListener,FocusListener {
	private JLabel tHabi, Nhabi, reNinios, exNinios, edNinios, imHabit, fHabit, nombre, lhabitacion1, lhabitacion2,
			lhabitacion3;
	protected static JTextField cajatHabi, cajareNinios, cajaexNinios, cajaedNinios, cajaimHabit, cajaSpiner;
	protected static JCheckBox cbninios;
	protected static JSpinner spnHabi, spEdad;
	private ImageIcon habitacion1, habitacion2, habitacion3;
	private JPanel pn, pn2, pnfotos;
	private JButton btn1, btn2, btn3;
	protected static JComboBox<String> combo;
	boolean bandera = true;
	private PanelShowMessageFotos pfoto1;
	private PanelShowMessageFotos2 pfoto2;
	private PanelShowMessageFotos3 pfoto3;
    int precio=0;
	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints; // constraints of this layout

	public Panel3() {
		// layout
		layout = new GridBagLayout();
		this.setLayout(layout);
		this.setOpaque(false);// que se vea el fondo
		instanciarComponentes();
		centrarComponentes();
		JPanel p22 = new JPanel();

		JLabel nombre = new JLabel("DATOS DE HABITACIÓN");
		nombre.setFont(new Font("Ink Free", Font.PLAIN, 24));
		Color color1 = new Color(11, 1, 97);
		nombre.setForeground(color1);
		p22.add(nombre);
		p22.setBackground(Color.yellow);
		this.add(p22);
		pintarLabel();
		colocarComponentes();

	}

	private void instanciarComponentes() {
		// label
		tHabi = new JLabel("TIPO DE HABITACIÓN");
		Nhabi = new JLabel("NUMERO DE HABITACIÓNES RESERVADAS");
		reNinios = new JLabel("¿niños?");
		exNinios = new JLabel("EXTRAS");
		edNinios = new JLabel("EDAD NIÑOS");
		imHabit = new JLabel("IMPORTE HABITACION-CLICK AQUÍ PARA VERLO");
		fHabit = new JLabel("fOTOS DE LAS HABITACIONES");
		// textfield
		cajatHabi = new JTextField();
		cajareNinios = new JTextField();
		cajaexNinios = new JTextField("Cuna");
		cajaexNinios.setEditable(false);
		cajaedNinios = new JTextField();
		cajaimHabit = new JTextField();
		
		cajaimHabit.setEditable(false);
		SpinnerModel sm = new SpinnerNumberModel(0, 0, 50, 1);
		SpinnerModel smE = new SpinnerNumberModel(0, 0, 14, 1);
		// spinner
		spnHabi = new JSpinner(sm);
		spEdad = new JSpinner(smE);
		// checkbox
		cbninios = new JCheckBox("¿NIÑOS?");
		cbninios.setOpaque(false);
		// panel de niños
		pn = new JPanel();
		pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));

		nombre = new JLabel("***EXTRA NIÑOS***");
		pn2 = new JPanel();
		// combobox
		combo = new JComboBox();
		String[] opciones = { "Simple", "Doble", "Suite" };
		combo = new JComboBox<String>(opciones);
		// panel fotos

		pnfotos = new JPanel();
		pnfotos.setLayout(new BoxLayout(pnfotos, BoxLayout.Y_AXIS));
		pnfotos.setOpaque(false);
		habitacion1 = new ImageIcon(getClass().getResource("Recursos/habitacion1.jpg"));
		habitacion2 = new ImageIcon(getClass().getResource("Recursos/habitacion2.jpg"));
		habitacion3 = new ImageIcon(getClass().getResource("Recursos/habitacion3.jpg"));
		lhabitacion1 = new JLabel(habitacion1);
		lhabitacion2 = new JLabel(habitacion2);
		lhabitacion3 = new JLabel(habitacion3);

		btn1 = new JButton("VER HABITACIÓN 1");
		btn2 = new JButton("VER HABITACIÓN 2");
		btn3 = new JButton("VER HABITACIÓN 3");
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.yellow);
		btn3.setBackground(Color.yellow);
		// listeners
		btn1.addActionListener(this);

		btn2.addActionListener(this);
		btn3.addActionListener(this);
		cbninios.addActionListener(this);
		spEdad.addChangeListener( this);
		cajaimHabit.addFocusListener(this);
	}

	private void centrarComponentes() {
		// label
		tHabi.setHorizontalAlignment(JTextField.CENTER);
		Nhabi.setHorizontalAlignment(JTextField.CENTER);
		reNinios.setHorizontalAlignment(JTextField.CENTER);
		exNinios.setHorizontalAlignment(JTextField.CENTER);
		edNinios.setHorizontalAlignment(JTextField.CENTER);
		imHabit.setHorizontalAlignment(JTextField.CENTER);
		fHabit.setHorizontalAlignment(JTextField.CENTER);
		// //textfield
		cajatHabi.setHorizontalAlignment(JTextField.CENTER);
		cajareNinios.setHorizontalAlignment(JTextField.CENTER);
		cajaexNinios.setHorizontalAlignment(JTextField.CENTER);
		cajaedNinios.setHorizontalAlignment(JTextField.CENTER);
		cajaimHabit.setHorizontalAlignment(JTextField.CENTER);
		cbninios.setHorizontalAlignment(JTextField.CENTER);
		nombre.setHorizontalAlignment(JTextField.CENTER);

	}

	private void pintarLabel() {
		// label de color amarillo
		tHabi.setForeground(Color.yellow);
		Nhabi.setForeground(Color.yellow);
		reNinios.setForeground(Color.yellow);
		exNinios.setForeground(Color.yellow);
		edNinios.setForeground(Color.yellow);
		imHabit.setForeground(Color.yellow);
		fHabit.setForeground(Color.yellow);
		cbninios.setForeground(Color.yellow);
	}

	private void colocarComponentes() {
		// constrains
		// Creamos un Insets
		Insets insert = new Insets(0, 1, 1, 1);
		// tipo habitacion
		constraints = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(tHabi, constraints); // set constraints
		this.add(tHabi); // add component

		// caja habitacion
		constraints = new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(combo, constraints); // set constraints
		this.add(combo); // add component

		// numero habitacion
		constraints = new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				insert, 0, 0);
		layout.setConstraints(Nhabi, constraints); // set constraints
		this.add(Nhabi); // add component

		// spinner numero habitacion
		constraints = new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(spnHabi, constraints); // set constraints
		this.add(spnHabi); // add component

		// spinner numero habitacion
		constraints = new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);

		layout.setConstraints(cbninios, constraints); // set constraints
		this.add(cbninios); // add component

		// panel niños

		// componentes
		nombre.setFont(new Font("Ink Free", Font.PLAIN, 16));
		Color color1 = new Color(11, 1, 97);
		nombre.setForeground(color1);
		pn2.add(nombre);
		pn.add(pn2);
		pn2.setBackground(Color.yellow);
		pn.setOpaque(false);
		pn.add(edNinios);
		pn.add(spEdad);
		pn.add(exNinios);
		pn.add(cajaexNinios);
//		pn.add(imHabit);
//		pn.add(cajaimHabit);
		pn.setVisible(false);

		// constrains panel niños
		constraints = new GridBagConstraints(0, 7, 2, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				insert, 0, 0);
		layout.setConstraints(pn, constraints); // set constraints
		this.add(pn); // add component
        //Panel importe
		constraints = new GridBagConstraints(0, 13, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);
		layout.setConstraints(imHabit, constraints); // set constraints
		this.add(imHabit); // add component

		constraints = new GridBagConstraints(0, 15, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);
		layout.setConstraints(cajaimHabit, constraints); // set constraints
		this.add(cajaimHabit); // add component
		// Botonos de habitaciones
		constraints = new GridBagConstraints(0, 17, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);
		layout.setConstraints(btn1, constraints); // set constraints
		this.add(btn1); // add component

		constraints = new GridBagConstraints(0, 19, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);
		layout.setConstraints(btn2, constraints); // set constraints
		this.add(btn2); // add component

		constraints = new GridBagConstraints(0, 21, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, insert, 0, 0);
		layout.setConstraints(btn3, constraints); // set constraints
		this.add(btn3); // add component
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn1) {
			pfoto1 = new PanelShowMessageFotos();
			this.add(pfoto1);
		}
		if (e.getSource() == btn2) {
			pfoto2 = new PanelShowMessageFotos2();
			this.add(pfoto2);
		}
		if (e.getSource() == btn3) {
			pfoto3 = new PanelShowMessageFotos3();
			this.add(pfoto3);
		}
		if (e.getSource() == cbninios && bandera == true) {
			pn.setVisible(true);
			bandera = false;
			precio+=(precio+20);
		} else if (e.getSource() == cbninios && bandera == false) {
			pn.setVisible(false);
			bandera = true;
			precio+=(precio-20);
		}
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
				
		
		if ((int) spEdad.getValue() <= 3) {
			cajaexNinios.setText("Cuna");
		}
		if ((int) spEdad.getValue() <= 10 && (int) spEdad.getValue() > 3) {
			cajaexNinios.setText("Cama supletoria pequeña");
		}
		if ((int) spEdad.getValue() > 10) {
		cajaexNinios.setText("Cama supletoria normal");
			
		}
		
		}

	@Override
	public void focusGained(FocusEvent e) {
		String tipo= (String)combo.getSelectedItem();
		if(tipo=="Simple"){precio=50;
		}else if(tipo=="Doble"){precio=75;
		}else if(tipo=="Suite"){precio=125;}
				
		int dias= Integer.parseInt(Panel2.cajaNumeroDias.getText());
		int habitaciones= (int)spnHabi.getValue();
		if(cbninios.isSelected()) {precio=precio+20;}
		//lo multiplico por los dias y habitaciones
		precio=precio*dias;
		precio=precio*habitaciones;
		String costo= precio+"€";
		cajaimHabit.setText(costo);
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		
	}
	    
}
