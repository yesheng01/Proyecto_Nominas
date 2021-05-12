
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
//import java.awt.font;

public class Panel extends JFrame {


	private JFrame frame;
	private JLabel label_Titulo;
	private JTextField name;
	private JTextField lastname;
	private JTextField email;
	private JTextField direccion;
	private JTextField dia_i_r;
	private JTextField dia_i_f;
	private JTextField mes_i_r;
	private JTextField mes_i_f;
	private JTextField any_i_r;
	private JTextField any_i_f;
	private JTextField hefm_r;
	private JTextField her_r;
	private JTextField hc_r;
	private JLabel hefm;
	private JLabel her;
	private JLabel hc;

	private JComboBox<String> comboBox;
	private List<Empleado> result;
	Engine engine = new Engine();
	private  Empleado empleado;
	String chosenName;
	int entradas = 0;
	int indiceActualEntrada;
	javax.swing.ImageIcon cidexnb = new javax.swing.ImageIcon("src\\recursos\\cidenb2.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel window = new Panel();
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
	public Panel() throws Exception {
		setTitle("Nominas Balears X CIDE");
		initialize();
		this.getContentPane().setBackground(getBackground());
		this.setLocationRelativeTo(null);
		this.setTitle("Primer");

		addDnis(engine.dnis());

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		
		label_Titulo = new JLabel(cidexnb);

		
		JLabel dni_o_nif = new JLabel("DNI o NIF");
		
		JButton auto_rellenar = new JButton("Auto Rellenar");
		auto_rellenar.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event. ActionEvent evt) {
						autoRellenar(evt);
					}
				}
		);
		add(auto_rellenar);
		
		comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chosenName =  (String) comboBox.getSelectedItem();
			}
		});
		
		JLabel nombre = new JLabel("Nombre: ");
		
		JLabel apellido = new JLabel("Apellidos: ");
		
		JLabel email = new JLabel("E-Mail: ");
		
		JLabel direccion = new JLabel("Direccion: ");

		name = new JTextField();
		name.setColumns(10);
		
		this.lastname = new JTextField();
		this.lastname.setColumns(10);
		
		this.email = new JTextField();
		this.email.setColumns(10);
		
		this.direccion = new JTextField();
		this.direccion.setColumns(10);
		
		JLabel fecha_inicial = new JLabel("Fecha Inicial:");
		
		JLabel fecha_final = new JLabel("Fecha Final:");
		
		JLabel dia_i = new JLabel("dia");
		JLabel dia_f = new JLabel("dia");
		
		dia_i_r = new JTextField();
		dia_i_r.setColumns(10);
		dia_i_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});


		dia_i_f = new JTextField();
		dia_i_f.setColumns(10);
		dia_i_f.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});


		JLabel mes_i = new JLabel("mes");
		JLabel mes_f = new JLabel("mes");

		mes_i_r = new JTextField();
		mes_i_r.setColumns(10);
		mes_i_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});


		mes_i_f = new JTextField();
		mes_i_f.setColumns(10);
		mes_i_f.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});


		JLabel any_i = new JLabel("año");
		JLabel any_f = new JLabel("año");

		
		any_i_r = new JTextField();
		any_i_r.setColumns(10);
		any_i_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});
		
		any_i_f = new JTextField();
		any_i_f.setColumns(10);
		any_i_f.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});
		
		hefm = new JLabel("Horas Extra Fuerza Mayor: ");

		her = new JLabel("Horas extra Resto: ");
		
		hc = new JLabel("Horas Complementarias: ");
		
		hefm_r = new JTextField();
		hefm_r.setColumns(10);
		hefm_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});
		
		her_r = new JTextField();
		her_r.setColumns(10);
		her_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});
		
		hc_r = new JTextField();
		hc_r.setColumns(10);
		hc_r.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if(((caracter < '0') ||
						(caracter > '9')) &&
						(caracter != '\b' /*corresponde a BACK_SPACE*/))
				{
					e.consume();  // ignorar el evento de teclado
				}
			}
		});
		
		JButton generar_button = new JButton("Generar");
		generar_button.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event. ActionEvent evt) {
						try {
							AbrirVentana(evt);
							int anyosW = engine.calcularAntiguedad(engine.getFecha_Contrata_Date(empleado.getDni()), fecha_final_date());
							int dias = engine.totalDias(fecha_inicio_date(),fecha_final_date());

							String dni_empl = empleado.getDni();
							String cif = "A58818501";

							int gethefm_r = Integer.parseInt(hefm_r.getText());
							int gethcr = Integer.parseInt (hc_r.getText());
							int gether = Integer.parseInt(her_r.getText());
							double hefmFin = engine.calcHoras(gethefm_r,engine.selectHorasExtFM(empleado.getId_convenio()));
							double herFin = engine.calcHoras(gether,engine.selectHorasExtR(empleado.getId_convenio()));
							double hcFin = engine.calcHoras(gethcr,engine.selectHorasExtR(empleado.getId_convenio()));
							double hefmP = engine.getPorcentaje_hefm(empleado.getId_convenio());
							double herP = engine.getPorcentaje_her(empleado.getId_convenio());
							double prechefm = (hefmP*hefmFin)/100;
							double precher = (herP*hcFin)/100;
							double totalDev = engine.totalDevengado(engine.getSueldo_base(dni_empl), gethefm_r, gether , gethcr , engine.antiguedad(empleado.getId_convenio()));
							double cc = engine.cotingenciasComunes(totalDev,hefmFin ,herFin, hcFin);
							double irpfdone = (engine.getIrpf(dni_empl)*totalDev)/100;

							double fp = engine.formacionProfesional(engine.fp(empleado.getId_convenio()),cc,hefmFin,herFin,hcFin);
							double totoalDeduc = engine.totalaDeducir(fp,prechefm, precher);
							double totoalPerc = engine.liquidoaPercibir(totalDev,totoalDeduc);

							engine.insertarNomina(engine.obtenirNouIDNomina(), dni_empl, empleado.getNom(), empleado.getApellidos(),engine.getGrupo_profesional(dni_empl),engine.getGrupo_cotizacion(dni_empl), engine.getNum_ss(dni_empl),
									irpfdone,engine.getCcc_ss(cif), fecha_inicio(evt),
									fecha_final(evt),dias,engine.getSueldo_base(dni_empl),hefmFin, herFin,hcFin,cc,totalDev,totoalDeduc,totoalPerc,engine.cobradoAntiguedad(anyosW,engine.antiguedad(empleado.getId_convenio())),fp);

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
		);
		add(generar_button);






		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(190)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(dni_o_nif, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
								.addComponent(label_Titulo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(auto_rellenar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(14)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(nombre, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
										.addComponent(apellido))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(fecha_inicial, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
												.addComponent(fecha_final, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
											.addGap(27)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(dia_f, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
												.addComponent(dia_i, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lastname)
										.addComponent(name, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(64)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(her, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(hc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(hefm, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
									.addGap(36)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(dia_i_f, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
													.addComponent(dia_i_r, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
												.addComponent(direccion))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(email, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(mes_f)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(mes_i_f, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(mes_i)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(mes_i_r, 0, 0, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(any_i)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(any_i_r, 0, 0, Short.MAX_VALUE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(any_f)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(any_i_f, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(this.direccion)
												.addComponent(this.email, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(her_r, Alignment.LEADING)
									.addComponent(hefm_r, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
								.addComponent(hc_r, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(188, Short.MAX_VALUE)
					.addComponent(generar_button, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(178))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_Titulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(dni_o_nif, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(auto_rellenar)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nombre, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lastname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(apellido, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.direccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(direccion, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fecha_inicial, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(dia_i)
						.addComponent(dia_i_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mes_i)
						.addComponent(mes_i_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(any_i)
						.addComponent(any_i_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fecha_final, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(dia_f)
						.addComponent(dia_i_f, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mes_f)
						.addComponent(mes_i_f, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(any_f)
						.addComponent(any_i_f, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hefm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(hefm_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(her, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(her_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hc_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(generar_button, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public void addDnis(ArrayList<String> allDnis){
		for (String allDni : allDnis) {
			comboBox.addItem(allDni);
		}
	}

	public void AbrirVentana(ActionEvent evt) throws Exception {
		Panel2 form = new Panel2();
		form.iniciar();
		this.dispose();

	}

	public void autoRellenar(ActionEvent evt){
		try {
			result = engine.getEmpleadoByDni(chosenName);
			entradas = result.size();
			if (entradas != 0){
				indiceActualEntrada = 0;
				empleado = result.get(indiceActualEntrada);
				name.setText(""+empleado.getNom());
				lastname.setText(""+empleado.getApellidos());
				email.setText(""+empleado.getAelectronica());
				direccion.setText(""+empleado.getDireccion());

			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	public java.sql.Date fecha_inicio(ActionEvent evt) throws ParseException {
		String data=any_i_r.getText()+"/"+mes_i_r.getText()+"/"+dia_i_r.getText();
		Date date= df.parse(data);
		return convert(date);
	}
	public java.sql.Date fecha_final(ActionEvent evt) throws ParseException {
		String data=any_i_f.getText()+"/"+mes_i_f.getText()+"/"+dia_i_f.getText();
		Date date= df.parse(data);
		return convert(date);
	}

	public Date fecha_final_date() throws ParseException {
		String data=any_i_f.getText()+"/"+mes_i_f.getText()+"/"+dia_i_f.getText();
		return df.parse(data);
	}
	public Date fecha_inicio_date() throws ParseException {
		String data=any_i_r.getText()+"/"+mes_i_r.getText()+"/"+dia_i_r.getText();
		return df.parse(data);
	}


	private static java.sql.Date convert(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}


	public int hora_efm(ActionEvent evt){
		String hor = hefm.getText();
		return Integer.parseInt(hor);
	}
	public int hora_er(ActionEvent evt){
			String hor = her.getText();
			return Integer.parseInt(hor);

	}
	public int hora_complemetaria(ActionEvent evt){
		String hor = hc.getText();
		return Integer.parseInt(hor);

	}

}
