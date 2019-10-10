package FrontEnd;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Interface extends JFrame {

	private JPanel fondoPane;
	private JTextField buscarTextField;
	private JButton analizarButton;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblFanIn;
	private JLabel lblLongitud;
	private JTextField textField_8;
	private JLabel lblN;
	private JTextField textField_9;
	private JLabel lblN_1;
	private JTextField textField_10;
	private JLabel lblVolumen;
	private JTextField textField_11;
	private JLabel lblDificultad;
	private JTextField textField_12;
	private JLabel lblNivel;
	private JTextField textField_13;
	private JLabel lblEsfuerzo;
	private JTextField textField_14;
	private JLabel lblTiempoEntendido;
	private JTextField textField_15;
	private JLabel lblN_2;
	private JLabel lblN_3;
	private JLabel lblN_4;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 447);
		fondoPane = new JPanel();
		fondoPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fondoPane);
		
		buscarTextField = new JTextField();
		buscarTextField.setColumns(10);
		
		JButton buscarButton = new JButton("Buscar");
		
		analizarButton = new JButton("Analizar");
		
		JComboBox comboBox = new JComboBox();
		
		comboBox_1 = new JComboBox();
		
		comboBox_2 = new JComboBox();
		
		comboBox_3 = new JComboBox();
		
		comboBox_4 = new JComboBox();
		
		comboBox_5 = new JComboBox();
		
		JLabel lblLabel = new JLabel("Label 1");
		
		JLabel lblLabel_1 = new JLabel("Label 2");
		
		JLabel lblLabel_2 = new JLabel("Label 3");
		
		JLabel lblLabel_3 = new JLabel("Label 4");
		
		JLabel lblLabel_4 = new JLabel("Label 5");
		
		JLabel lblLabel_5 = new JLabel("Label 6");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblCc = new JLabel("CC");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblFanOut = new JLabel("Fan Out");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		lblFanIn = new JLabel("Fan In");
		
		lblLongitud = new JLabel("Longitud");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		lblN = new JLabel("N1");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		lblN_1 = new JLabel("N2");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		lblVolumen = new JLabel("Volumen");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		lblDificultad = new JLabel("Dificultad");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		lblNivel = new JLabel("Nivel");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		lblEsfuerzo = new JLabel("Esfuerzo");
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		lblTiempoEntendido = new JLabel("Tiempo Entendido");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		lblN_2 = new JLabel("n");
		
		lblN_3 = new JLabel("n1");
		
		lblN_4 = new JLabel("n2");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		GroupLayout gl_fondoPane = new GroupLayout(fondoPane);
		gl_fondoPane.setHorizontalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addComponent(analizarButton, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel_5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel_1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
									.addGap(34))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(lblLabel_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(lblLabel_3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comboBox_3, 0, 205, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comboBox_4, 0, 205, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_fondoPane.createSequentialGroup()
															.addComponent(lblComentarios, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_fondoPane.createSequentialGroup()
															.addComponent(lblCc, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(lblCodigo)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
													.addGap(29))))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addComponent(lblFanOut, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(170))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addComponent(lblFanIn, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblDificultad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblVolumen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
												.addComponent(lblNivel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblEsfuerzo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblTiempoEntendido, Alignment.LEADING))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblLongitud, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(lblN_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblN, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_10, 0, 0, Short.MAX_VALUE)
												.addComponent(textField_9, 0, 0, Short.MAX_VALUE)
												.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblN_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblN_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblN_2, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comboBox_1, 0, 116, Short.MAX_VALUE)
									.addGap(441))
								.addComponent(buscarTextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buscarButton, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_fondoPane.setVerticalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(buscarButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCc)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTipo)
										.addComponent(lblLabel))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCodigo))
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLabel_1)
								.addComponent(lblComentarios)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFanOut)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLongitud)
										.addComponent(lblN_2)
										.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFanIn)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblLabel_3))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGap(3)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblN)
										.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblN_3)
										.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDificultad)
										.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLabel_5)
										.addComponent(lblNivel)
										.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblN_1)
										.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblN_4)
										.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblVolumen)
										.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGap(101)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEsfuerzo)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTiempoEntendido)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addComponent(analizarButton))
		);
		fondoPane.setLayout(gl_fondoPane);
	}
}
