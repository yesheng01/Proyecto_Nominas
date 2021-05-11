
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JComboBox<String> comboBox;
	private List<Empleado> result;
	Engine engine = new Engine();
	private  Empleado empleado;
	String chosenName;
	int entradas = 0;
	int indiceActualEntrada;
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
		
		label_Titulo = new JLabel("NOMINABALEAR");
		label_Titulo.setFont(label_Titulo.getFont().deriveFont(label_Titulo.getFont().getStyle()));
		
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
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel mes_i = new JLabel("mes");
		
		JLabel mes_f = new JLabel("mes");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel any_i = new JLabel("año");
		
		JLabel any_f = new JLabel("año");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel hefm = new JLabel("Horas Extra Fuerza Mayor: ");
		
		JLabel her = new JLabel("Horas extra Resto: ");
		
		JLabel hc = new JLabel("Horas Complementarias: ");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JButton generar_button = new JButton("Generar");
		generar_button.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(java.awt.event. ActionEvent evt) {
						AbrirVentana(evt);
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
													.addComponent(textField_5, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
													.addComponent(textField_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
												.addComponent(direccion))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(email, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(mes_f)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(mes_i)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_6, 0, 0, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(any_i)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_8, 0, 0, Short.MAX_VALUE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(any_f)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(this.direccion)
												.addComponent(this.email, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_11, Alignment.LEADING)
									.addComponent(textField_10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))))
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
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mes_i)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(any_i)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fecha_final, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(dia_f)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mes_f)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(any_f)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hefm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(her, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

	public void AbrirVentana(ActionEvent evt){
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

}
