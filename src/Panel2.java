

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

public class Panel2 extends JFrame{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public  void iniciar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel2 windows = new Panel2();
					windows.frame.setVisible(true);
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
		this.getContentPane().setBackground(getBackground());
		this.setLocationRelativeTo(null);
		this.setTitle("Nomina Generado");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 0, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel titulo = new JLabel("NOMINABALEAR");

		JLabel id_nomina = new JLabel("ID Nomina");

		JLabel id_nomina_hn = new JLabel("000000000000000");

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new MigLayout("", "[107.00][][92.00]", "[][20.00][20.00][20.00][20.00][20.00]"));

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();

		JPanel panel_4 = new JPanel();

		JPanel panel_5 = new JPanel();

		JButton generar_pdf_o_csv = new JButton("Generar PDF O CSV");

		JButton generar_xml = new JButton("Generar XML");

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(10)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(id_nomina, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(id_nomina_hn, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
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
										.addComponent(generar_xml, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
										.addComponent(generar_pdf_o_csv, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
								.addGap(250))
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(272, Short.MAX_VALUE)
								.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(257))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(id_nomina, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addComponent(id_nomina_hn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(generar_pdf_o_csv)
								.addGap(18)
								.addComponent(generar_xml)
								.addGap(22))
		);

		//PANEL DE LIQUIDO TOTAL A RECIBIR
		panel_5.setLayout(new MigLayout("", "[222.00][201.00][210.00]", "[25.00]"));

		JLabel liquido_t_percibir = new JLabel("LIQUIDO TOTAL A PERCIBIR: ");
		panel_5.add(liquido_t_percibir, "cell 0 0");

		JLabel liquido_t_percibir_r = new JLabel("000000.00");
		panel_5.add(liquido_t_percibir_r, "cell 1 0");

		JLabel liquido_t_percibir_eur = new JLabel("€€");
		panel_5.add(liquido_t_percibir_eur, "cell 2 0");
		panel_4.setLayout(new MigLayout("", "[187.00][181.00][217.00]", "[25.00][25.00][25.00][25.00][25.00]"));

		//PaneldeContingencias--------------------------------------------------------------------------------------------

		JLabel contingencias = new JLabel("Contingencias Comunes: ");
		panel_4.add(contingencias, "cell 0 0");

		JLabel contingencias_p = new JLabel("porcentaje");
		panel_4.add(contingencias_p, "cell 1 0");

		JLabel contingencias_e = new JLabel("euros");
		panel_4.add(contingencias_e, "cell 2 0");

		JLabel formacion_profesional = new JLabel("Formacion Profesional");
		panel_4.add(formacion_profesional, "cell 0 1");

		JLabel formacion_profesional_p = new JLabel("porcentaje");
		panel_4.add(formacion_profesional_p, "cell 1 1");

		JLabel formacion_profesional_e = new JLabel("euros");
		panel_4.add(formacion_profesional_e, "cell 2 1");

		JLabel irpf = new JLabel("IRPF");
		panel_4.add(irpf, "cell 0 3");

		JLabel irpf_p = new JLabel("porcentaje");
		panel_4.add(irpf_p, "cell 1 3");

		JLabel irpf_e = new JLabel("euros");
		panel_4.add(irpf_e, "cell 2 3");

		JLabel total_a_deducir = new JLabel("Total a Deducir");
		panel_4.add(total_a_deducir, "cell 0 4");

		JLabel total_a_deducir_precio = new JLabel("00000000000");
		panel_4.add(total_a_deducir_precio, "cell 1 4");

		JLabel lblNewLabel_8_1_1_1_14 = new JLabel("");
		panel_4.add(lblNewLabel_8_1_1_1_14, "cell 2 4");
		panel_3.setLayout(new MigLayout("", "[284.00][316.00]", "[25.00][25.00][25.00][25.00][25.00][25.00]"));

		// Panel de SALARIO BASE--------------------------------------------------------------------------------------

		JLabel salario_base = new JLabel("Salario base: ");
		panel_3.add(salario_base, "cell 0 0");

		JLabel salario_base_r = new JLabel("0000.00");
		panel_3.add(salario_base_r, "cell 1 0");

		JLabel hefm = new JLabel("Horas Extra Fuerza Mayor: ");
		panel_3.add(hefm, "cell 0 1");

		JLabel hefm_r = new JLabel("0000");
		panel_3.add(hefm_r, "cell 1 1");

		JLabel horas_extras_resto = new JLabel("Horas Extras Resto");
		panel_3.add(horas_extras_resto, "cell 0 2");

		JLabel horas_extras_resto_r = new JLabel("0000000");
		panel_3.add(horas_extras_resto_r, "cell 1 2");

		JLabel horas_compl = new JLabel("Horas Complementarias: ");
		panel_3.add(horas_compl, "cell 0 3");

		JLabel horas_compl_r = new JLabel("000000000");
		panel_3.add(horas_compl_r, "cell 1 3");

		JLabel antiguedad = new JLabel("Antiguedad");
		panel_3.add(antiguedad, "cell 0 4");

		JLabel antiguedad_r = new JLabel("00000000");
		panel_3.add(antiguedad_r, "cell 1 4");

		JLabel total_devengos = new JLabel("Total Devengado: ");
		panel_3.add(total_devengos, "cell 0 5");

		JLabel total_devengos_r = new JLabel("000000"); //Total de devengado
		panel_3.add(total_devengos_r, "cell 1 5");
		panel_2.setLayout(new MigLayout("", "[75.00][][][][][][][][][][][45.00][][59.00][][][]", "[]"));


		//Panel de Liquidacion

		JLabel periodo_de_liquidacion = new JLabel("Periodo de Liquidacion");
		panel_2.add(periodo_de_liquidacion, "cell 0 0");

		JLabel periodo_de_liquidacion_del = new JLabel("del");
		panel_2.add(periodo_de_liquidacion_del, "cell 3 0");

		JLabel periodo_de_liquidacion_diai = new JLabel("00");
		panel_2.add(periodo_de_liquidacion_diai, "cell 5 0");

		JLabel periodo_de_liquidacion_mesi = new JLabel("00");
		panel_2.add(periodo_de_liquidacion_mesi, "cell 6 0");

		JLabel periodo_de_liquidacion_anyo1 = new JLabel("0000");
		panel_2.add(periodo_de_liquidacion_anyo1, "cell 7 0");

		JLabel periodo_de_liquidacion_al = new JLabel("al");
		panel_2.add(periodo_de_liquidacion_al, "cell 9 0");

		JLabel periodo_de_liquidacion_diaf = new JLabel("00");
		panel_2.add(periodo_de_liquidacion_diaf, "cell 10 0");

		JLabel periodo_de_liquidacion_mesf = new JLabel("00");
		panel_2.add(periodo_de_liquidacion_mesf, "cell 11 0");

		JLabel periodo_de_liquidacion_anyof = new JLabel("0000");
		panel_2.add(periodo_de_liquidacion_anyof, "cell 12 0");

		JLabel total_dias = new JLabel("Total de dias: ");
		panel_2.add(total_dias, "cell 14 0");

		JLabel total_dias_r = new JLabel("00");
		panel_2.add(total_dias_r, "cell 16 0");

		//------------------------------------------------------------------------------------------------------------

		JLabel empresa = new JLabel("Empresa");
		panel_1.add(empresa, "cell 1 0");

		JLabel nombre_empresa = new JLabel("Nombre de Empresa: ");
		panel_1.add(nombre_empresa, "cell 0 1");

		JLabel nombre_empresa_r = new JLabel("New Label"); //Nombre de empresa
		panel_1.add(nombre_empresa_r, "cell 2 1");

		JLabel domicilio = new JLabel("Domicilio");
		panel_1.add(domicilio, "cell 0 2");

		JLabel domicilio_r = new JLabel("New label"); //DOMICILIO DE EMPRESA
		panel_1.add(domicilio_r, "cell 2 2");

		JLabel localidad = new JLabel("Localidad");
		panel_1.add(localidad, "cell 0 3");

		JLabel localidad_r = new JLabel("New label"); //Localidad de empresa
		panel_1.add(localidad_r, "cell 2 3");

		JLabel cif = new JLabel("CIF");
		panel_1.add(cif, "cell 0 4");

		JLabel cif_r = new JLabel("New label"); //CIF DE EMPRESA
		panel_1.add(cif_r, "cell 2 4");

		JLabel ccc_ss = new JLabel("CCC de la SS: ");
		panel_1.add(ccc_ss, "cell 0 5");

		JLabel ccc_ss_r = new JLabel("New label"); // CCC DE EMPRESA


		//PRIMER PANEL		

		panel_1.add(ccc_ss_r, "cell 2 5");
		panel.setLayout(new MigLayout("", "[97.00][][91.00]", "[][20.00][20.00][20.00][20.00][21.00]"));

		JLabel trabajador = new JLabel("Trabajador");
		panel.add(trabajador, "cell 1 0");

		JLabel dni = new JLabel("DNI: ");
		panel.add(dni, "cell 0 1");

		JLabel dni_r = new JLabel("NEW LABEL: "); // ESTO ES EL DNI
		panel.add(dni_r, "cell 2 1");

		JLabel nombre_apellidos_concat = new JLabel("Nombre y Apellido: ");
		panel.add(nombre_apellidos_concat, "cell 0 2");

		JLabel nombre_apellidos_concat_r = new JLabel("New label"); // ESTO ES EL NOMBRE Y APELLIDO
		panel.add(nombre_apellidos_concat_r, "cell 2 2");

		JLabel grupo_profesional = new JLabel("Grupo Profesional: ");
		panel.add(grupo_profesional, "cell 0 3");

		JLabel grupo_profesional_r = new JLabel("New label"); // ESTO ES EL GRUPO PROFESIONAL
		panel.add(grupo_profesional_r, "cell 2 3");

		JLabel grupo_cotizacion = new JLabel("Grupo de Cotizacion: ");
		panel.add(grupo_cotizacion, "cell 0 4");

		JLabel grupo_cotizacion_r = new JLabel("New label"); // ESTO ES EL GRUPO DE COTIZACION
		panel.add(grupo_cotizacion_r, "cell 2 4");

		JLabel num_de_ss = new JLabel("Nº de SS");
		panel.add(num_de_ss, "cell 0 5");

		JLabel num_de_ss_r = new JLabel("New label"); //ESTO ES EL NUMERO DE SEGURIDAD SOCIAL
		panel.add(num_de_ss_r, "cell 2 5");
		frame.getContentPane().setLayout(groupLayout);
	}
}