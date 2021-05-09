package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel2 window = new Panel2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panel2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(800, 800, 650, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("NOMINABALEAR");
		
		JLabel lblNewLabel_1 = new JLabel("ID Nomina");
		
		JLabel lblNewLabel_1_1 = new JLabel("0000000000000000000000");
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new MigLayout("", "[107.00][][92.00]", "[][20.00][20.00][20.00][20.00][20.00]"));
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		
		JButton btnNewButton = new JButton("Generar PDF O CSV");
		
		JButton btnNewButton_1 = new JButton("Generar XML");
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(414, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
									.addGap(30)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(panel_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE))
							.addGap(7))))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(246)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
					.addGap(250))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(272, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(257))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(22))
		);
		
		//PANEL DE LIQUIDO TOTAL A RECIBIR
		panel_5.setLayout(new MigLayout("", "[222.00][201.00][210.00]", "[25.00]"));
		
		JLabel lblNewLabel_9 = new JLabel("LIQUIDO TOTAL A PERCIBIR: ");
		panel_5.add(lblNewLabel_9, "cell 0 0");
		
		JLabel lblNewLabel_9_1 = new JLabel("000000.00");
		panel_5.add(lblNewLabel_9_1, "cell 1 0");
		
		JLabel lblNewLabel_9_2 = new JLabel("€€");
		panel_5.add(lblNewLabel_9_2, "cell 2 0");
		panel_4.setLayout(new MigLayout("", "[187.00][181.00][217.00]", "[25.00][25.00][25.00][25.00][25.00]"));
		
		//PaneldeContingencias--------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Contingencias Comunes: ");
		panel_4.add(lblNewLabel_8_1_1_1, "cell 0 0");
		
		JLabel lblNewLabel_8_1_1_1_5 = new JLabel("porcentaje");
		panel_4.add(lblNewLabel_8_1_1_1_5, "cell 1 0");
		
		JLabel lblNewLabel_8_1_1_1_10 = new JLabel("euros");
		panel_4.add(lblNewLabel_8_1_1_1_10, "cell 2 0");
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Formacion Profesional");
		panel_4.add(lblNewLabel_8_1_1_1_1, "cell 0 1");
		
		JLabel lblNewLabel_8_1_1_1_6 = new JLabel("porcentaje");
		panel_4.add(lblNewLabel_8_1_1_1_6, "cell 1 1");
		
		JLabel lblNewLabel_8_1_1_1_11 = new JLabel("euros");
		panel_4.add(lblNewLabel_8_1_1_1_11, "cell 2 1");
		
		JLabel lblNewLabel_8_1_1_1_2 = new JLabel("Anticipos");
		panel_4.add(lblNewLabel_8_1_1_1_2, "cell 0 2");
		
		JLabel lblNewLabel_8_1_1_1_7 = new JLabel("porcentaje");
		panel_4.add(lblNewLabel_8_1_1_1_7, "cell 1 2");
		
		JLabel lblNewLabel_8_1_1_1_12 = new JLabel("euros");
		panel_4.add(lblNewLabel_8_1_1_1_12, "cell 2 2");
		
		JLabel lblNewLabel_8_1_1_1_3 = new JLabel("IRPF");
		panel_4.add(lblNewLabel_8_1_1_1_3, "cell 0 3");
		
		JLabel lblNewLabel_8_1_1_1_8 = new JLabel("porcentaje");
		panel_4.add(lblNewLabel_8_1_1_1_8, "cell 1 3");
		
		JLabel lblNewLabel_8_1_1_1_13 = new JLabel("euros");
		panel_4.add(lblNewLabel_8_1_1_1_13, "cell 2 3");
		
		JLabel lblNewLabel_8_1_1_1_4 = new JLabel("Total a Deducir");
		panel_4.add(lblNewLabel_8_1_1_1_4, "cell 0 4");
		
		JLabel lblNewLabel_8_1_1_1_9 = new JLabel("00000000000");
		panel_4.add(lblNewLabel_8_1_1_1_9, "cell 1 4");
		
		JLabel lblNewLabel_8_1_1_1_14 = new JLabel("");
		panel_4.add(lblNewLabel_8_1_1_1_14, "cell 2 4");
		panel_3.setLayout(new MigLayout("", "[284.00][316.00]", "[25.00][25.00][25.00][25.00][25.00][25.00]"));
		
		// Panel de SALARIO BASE--------------------------------------------------------------------------------------
		
		JLabel lblNewLabel_8 = new JLabel("Salario base: ");
		panel_3.add(lblNewLabel_8, "cell 0 0");
		
		JLabel lblNewLabel_8_1_5 = new JLabel("0000.00");
		panel_3.add(lblNewLabel_8_1_5, "cell 1 0");
		
		JLabel lblNewLabel_8_1 = new JLabel("Horas Extra Fuerza Mayor: ");
		panel_3.add(lblNewLabel_8_1, "cell 0 1");
		
		JLabel lblNewLabel_8_1_6 = new JLabel("0000");
		panel_3.add(lblNewLabel_8_1_6, "cell 1 1");
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Horas Extras Resto");
		panel_3.add(lblNewLabel_8_1_1, "cell 0 2");
		
		JLabel lblNewLabel_8_1_7 = new JLabel("0000000");
		panel_3.add(lblNewLabel_8_1_7, "cell 1 2");
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Horas Complementarias: ");
		panel_3.add(lblNewLabel_8_1_2, "cell 0 3");
		
		JLabel lblNewLabel_8_1_8 = new JLabel("000000000");
		panel_3.add(lblNewLabel_8_1_8, "cell 1 3");
		
		JLabel lblNewLabel_8_1_3 = new JLabel("Antiguedad");
		panel_3.add(lblNewLabel_8_1_3, "cell 0 4");
		
		JLabel lblNewLabel_8_1_9 = new JLabel("00000000");
		panel_3.add(lblNewLabel_8_1_9, "cell 1 4");
		
		JLabel lblNewLabel_8_1_4 = new JLabel("Total Devengado: ");
		panel_3.add(lblNewLabel_8_1_4, "cell 0 5");
		
		JLabel lblNewLabel_8_1_10 = new JLabel("000000"); //Total de devengado
		panel_3.add(lblNewLabel_8_1_10, "cell 1 5");
		panel_2.setLayout(new MigLayout("", "[75.00][][][][][][][][][][][45.00][][59.00][][][]", "[]"));
		
		
		//Panel de Liquidacion
		
		JLabel lblNewLabel_7 = new JLabel("Periodo de Liquidacion");
		panel_2.add(lblNewLabel_7, "cell 0 0");
		
		JLabel lblNewLabel_7_1 = new JLabel("del");
		panel_2.add(lblNewLabel_7_1, "cell 3 0");
		
		JLabel lblNewLabel_7_1_1 = new JLabel("00");
		panel_2.add(lblNewLabel_7_1_1, "cell 5 0");
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("00");
		panel_2.add(lblNewLabel_7_1_1_1, "cell 6 0");
		
		JLabel lblNewLabel_7_1_1_1_1 = new JLabel("0000");
		panel_2.add(lblNewLabel_7_1_1_1_1, "cell 7 0");
		
		JLabel lblNewLabel_7_1_1_1_1_1 = new JLabel("al");
		panel_2.add(lblNewLabel_7_1_1_1_1_1, "cell 9 0");
		
		JLabel lblNewLabel_7_1_1_1_1_1_1 = new JLabel("00");
		panel_2.add(lblNewLabel_7_1_1_1_1_1_1, "cell 10 0");
		
		JLabel lblNewLabel_7_1_1_1_1_1_1_1 = new JLabel("00");
		panel_2.add(lblNewLabel_7_1_1_1_1_1_1_1, "cell 11 0");
		
		JLabel lblNewLabel_7_1_1_1_1_1_1_1_1 = new JLabel("0000");
		panel_2.add(lblNewLabel_7_1_1_1_1_1_1_1_1, "cell 12 0");
		
		JLabel lblNewLabel_7_1_1_1_1_1_1_1_1_1 = new JLabel("Total de dias: ");
		panel_2.add(lblNewLabel_7_1_1_1_1_1_1_1_1_1, "cell 14 0");
		
		JLabel lblNewLabel_12 = new JLabel("00");
		panel_2.add(lblNewLabel_12, "cell 16 0");
		
		//------------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel_10 = new JLabel("Empresa");
		panel_1.add(lblNewLabel_10, "cell 1 0");
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre de Empresa: ");
		panel_1.add(lblNewLabel_2_2, "cell 0 1");
		
		JLabel lblNewLabel_2_7 = new JLabel("New Label"); //Nombre de empresa
		panel_1.add(lblNewLabel_2_7, "cell 2 1");
		
		JLabel lblNewLabel_2_3 = new JLabel("Domicilio");
		panel_1.add(lblNewLabel_2_3, "cell 0 2");
		
		JLabel lblNewLabel_2_8 = new JLabel("New label"); //DOMICILIO DE EMPRESA
		panel_1.add(lblNewLabel_2_8, "cell 2 2");
		
		JLabel lblNewLabel_2_4 = new JLabel("Localidad");
		panel_1.add(lblNewLabel_2_4, "cell 0 3");
		
		JLabel lblNewLabel_2_9 = new JLabel("New label"); //Localidad de empresa
		panel_1.add(lblNewLabel_2_9, "cell 2 3");
		
		JLabel lblNewLabel_2_5 = new JLabel("CIF");
		panel_1.add(lblNewLabel_2_5, "cell 0 4");
		
		JLabel lblNewLabel_2_10 = new JLabel("New label"); //CIF DE EMPRESA
		panel_1.add(lblNewLabel_2_10, "cell 2 4");
		
		JLabel lblNewLabel_2_6 = new JLabel("CCC de la SS: ");
		panel_1.add(lblNewLabel_2_6, "cell 0 5");
		
		JLabel lblNewLabel_2_11 = new JLabel("New label"); // CCC DE EMPRESA
		
		
		//PRIMER PANEL		
		
		panel_1.add(lblNewLabel_2_11, "cell 2 5");
		panel.setLayout(new MigLayout("", "[97.00][][91.00]", "[][20.00][20.00][20.00][20.00][21.00]"));
		
		JLabel lblNewLabel_11 = new JLabel("Trabajador");
		panel.add(lblNewLabel_11, "cell 1 0");
		
		JLabel lblNewLabel_2 = new JLabel("DNI: ");
		panel.add(lblNewLabel_2, "cell 0 1");
		
		JLabel lblNewLabel_2_1 = new JLabel("NEW LABEL: "); // ESTO ES EL DNI
		panel.add(lblNewLabel_2_1, "cell 2 1");
		
		JLabel lblNewLabel_3 = new JLabel("Nombre y Apellido: ");
		panel.add(lblNewLabel_3, "cell 0 2");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label"); // ESTO ES EL NOMBRE Y APELLIDO
		panel.add(lblNewLabel_2_1_1, "cell 2 2");
		
		JLabel lblNewLabel_4 = new JLabel("Grupo Profesional: ");
		panel.add(lblNewLabel_4, "cell 0 3");
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("New label"); // ESTO ES EL GRUPO PROFESIONAL
		panel.add(lblNewLabel_2_1_1_1, "cell 2 3");
		
		JLabel lblNewLabel_5 = new JLabel("Grupo de Cotizacion: ");
		panel.add(lblNewLabel_5, "cell 0 4");
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("New label"); // ESTO ES EL GRUPO DE COTIZACION
		panel.add(lblNewLabel_2_1_1_1_1, "cell 2 4");
		
		JLabel lblNewLabel_6 = new JLabel("Nº de SS");
		panel.add(lblNewLabel_6, "cell 0 5");
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("New label"); //ESTO ES EL NUMERO DE SEGURIDAD SOCIAL
		panel.add(lblNewLabel_2_1_1_1_2, "cell 2 5");
		frame.getContentPane().setLayout(groupLayout);
	}
}
