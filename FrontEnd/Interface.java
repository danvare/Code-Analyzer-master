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
import javax.swing.JList;
import javax.swing.JTextArea;

public class Interface extends JFrame {

	private JPanel fondoPane;
	private JTextField buscarTextField;
	private JButton analizarButton;
	private JComboBox proyectoComboBox;
	private JComboBox packageComboBox;
	private JComboBox archivoComboBox;
	private JComboBox claseComboBox;
	private JComboBox metodoComboBox;
	private JTextField tipoTextField;
	private JTextField ccTextField;
	private JTextField codigoTextField;
	private JTextField comentariosTextField;
	private JTextField comentariosTextField_2;
	private JTextField fanOutTextField;
	private JTextField fanOutTextField_2;
	private JTextField fanInTextField;
	private JLabel fanInLabel;
	private JLabel longitudLabel;
	private JTextField longitudTextField;
	private JLabel nMay1Label;
	private JTextField nMay1TextField;
	private JLabel nMay2Label;
	private JTextField nMay2TextField;
	private JLabel volumenLabel;
	private JTextField volumenTextField;
	private JLabel dificultadLabel;
	private JTextField dificultadTextField;
	private JLabel nivelLabel;
	private JTextField nivelTextField;
	private JLabel esfuerzoLabel;
	private JTextField esfuerzoTextField;
	private JLabel tEntendidoLabel;
	private JTextField tEntendidoTextField;
	private JLabel nLabel;
	private JLabel n1Label;
	private JLabel n2Label;
	private JTextField nTextField;
	private JTextField n1TextField;
	private JTextField n2TextField;

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
		setBounds(100, 100, 865, 470);
		fondoPane = new JPanel();
		fondoPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fondoPane);
		
		buscarTextField = new JTextField();
		buscarTextField.setColumns(10);
		
		JButton buscarButton = new JButton("Buscar");
		
		analizarButton = new JButton("Analizar");
		
		JComboBox sourcePackageComboBox = new JComboBox();
		
		proyectoComboBox = new JComboBox();
		
		packageComboBox = new JComboBox();
		
		archivoComboBox = new JComboBox();
		
		claseComboBox = new JComboBox();
		
		metodoComboBox = new JComboBox();
		
		JLabel proyectoLabel = new JLabel("Proyecto");
		
		JLabel sourcePackageLabel = new JLabel("Source Package");
		
		JLabel packageLabel = new JLabel("Package");
		
		JLabel archivoLabel = new JLabel("Archivo");
		
		JLabel claseLabel = new JLabel("Clase");
		
		JLabel metodoLabel = new JLabel("Metodo");
		
		tipoTextField = new JTextField();
		tipoTextField.setColumns(10);
		
		JLabel tipoLabel = new JLabel("Tipo");
		
		ccTextField = new JTextField();
		ccTextField.setColumns(10);
		
		JLabel ccLabel = new JLabel("CC");
		
		codigoTextField = new JTextField();
		codigoTextField.setColumns(10);
		
		JLabel codigoLabel = new JLabel("Codigo");
		
		comentariosTextField = new JTextField();
		comentariosTextField.setColumns(10);
		
		JLabel comentariosLabel = new JLabel("Comentarios");
		
		comentariosTextField_2 = new JTextField();
		comentariosTextField_2.setColumns(10);
		
		fanOutTextField = new JTextField();
		fanOutTextField.setColumns(10);
		
		JLabel fanOutLabel = new JLabel("Fan Out");
		
		fanOutTextField_2 = new JTextField();
		fanOutTextField_2.setColumns(10);
		
		fanInTextField = new JTextField();
		fanInTextField.setColumns(10);
		
		fanInLabel = new JLabel("Fan In");
		
		longitudLabel = new JLabel("Longitud");
		
		longitudTextField = new JTextField();
		longitudTextField.setColumns(10);
		
		nMay1Label = new JLabel("N1");
		
		nMay1TextField = new JTextField();
		nMay1TextField.setColumns(10);
		
		nMay2Label = new JLabel("N2");
		
		nMay2TextField = new JTextField();
		nMay2TextField.setColumns(10);
		
		volumenLabel = new JLabel("Volumen");
		
		volumenTextField = new JTextField();
		volumenTextField.setColumns(10);
		
		dificultadLabel = new JLabel("Dificultad");
		
		dificultadTextField = new JTextField();
		dificultadTextField.setColumns(10);
		
		nivelLabel = new JLabel("Nivel");
		
		nivelTextField = new JTextField();
		nivelTextField.setColumns(10);
		
		esfuerzoLabel = new JLabel("Esfuerzo");
		
		esfuerzoTextField = new JTextField();
		esfuerzoTextField.setColumns(10);
		
		tEntendidoLabel = new JLabel("Tiempo Entendido");
		
		tEntendidoTextField = new JTextField();
		tEntendidoTextField.setColumns(10);
		
		nLabel = new JLabel("n");
		
		n1Label = new JLabel("n1");
		
		n2Label = new JLabel("n2");
		
		nTextField = new JTextField();
		nTextField.setColumns(10);
		
		n1TextField = new JTextField();
		n1TextField.setColumns(10);
		
		n2TextField = new JTextField();
		n2TextField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_fondoPane = new GroupLayout(fondoPane);
		gl_fondoPane.setHorizontalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGap(20)
							.addComponent(buscarTextField, GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(buscarButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(analizarButton, GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(proyectoLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addGap(128)
									.addComponent(tipoLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addGap(21)
									.addComponent(tipoTextField, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(proyectoComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(ccLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(ccTextField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(17)
									.addComponent(codigoLabel)
									.addGap(10)
									.addComponent(codigoTextField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addComponent(sourcePackageLabel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(sourcePackageComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
										.addComponent(packageLabel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(packageComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
										.addComponent(archivoLabel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
										.addComponent(archivoComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
										.addComponent(claseLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
										.addComponent(claseComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
										.addComponent(metodoLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(metodoComboBox, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
									.addGap(4)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addComponent(comentariosLabel)
												.addComponent(fanOutLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addComponent(fanInLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
												.addComponent(longitudLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(nMay2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(nMay1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
												.addComponent(dificultadLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(nivelLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
											.addGap(4)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
														.addComponent(comentariosTextField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
														.addComponent(fanOutTextField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
														.addComponent(fanInTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(longitudTextField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addComponent(nLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
														.addComponent(nTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(comentariosTextField_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
														.addComponent(fanOutTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING, false)
															.addComponent(nMay1TextField)
															.addGroup(gl_fondoPane.createSequentialGroup()
																.addGap(5)
																.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
																	.addComponent(nivelTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(dificultadTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
														.addComponent(nMay2TextField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_fondoPane.createSequentialGroup()
															.addComponent(n2Label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(n2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_fondoPane.createSequentialGroup()
															.addComponent(n1Label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(n1TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addComponent(volumenLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(volumenTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addComponent(esfuerzoLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(esfuerzoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addComponent(tEntendidoLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tEntendidoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGap(21)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_fondoPane.setVerticalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buscarButton))
					.addGap(11)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addComponent(proyectoLabel)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGap(3)
									.addComponent(tipoLabel))
								.addComponent(tipoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addComponent(proyectoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGap(3)
									.addComponent(ccLabel))
								.addComponent(ccTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGap(3)
									.addComponent(codigoLabel))
								.addComponent(codigoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addComponent(comentariosTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(fanOutTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_fondoPane.createSequentialGroup()
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGap(7)
											.addComponent(sourcePackageLabel)
											.addGap(6)
											.addComponent(sourcePackageComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(11)
											.addComponent(packageLabel)
											.addGap(6)
											.addComponent(packageComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(11)
											.addComponent(archivoLabel)
											.addGap(6)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(archivoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(nMay2Label))
											.addGap(11)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(claseLabel)
												.addComponent(volumenLabel)
												.addComponent(volumenTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(claseComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(dificultadLabel)
												.addComponent(dificultadTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addGap(3)
													.addComponent(comentariosLabel)
													.addGap(13)
													.addComponent(fanOutLabel)
													.addGap(12)
													.addComponent(fanInLabel)
													.addGap(11)
													.addComponent(longitudLabel)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(nMay1Label)
														.addComponent(nMay1TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(n1Label)
														.addComponent(n1TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_fondoPane.createSequentialGroup()
													.addComponent(comentariosTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(fanOutTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(fanInTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(5)
													.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(longitudTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(nLabel)
														.addComponent(nTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(nMay2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(n2Label)
												.addComponent(n2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addGap(11)
											.addComponent(metodoLabel)
											.addGap(6)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(metodoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(esfuerzoLabel)
												.addComponent(esfuerzoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_fondoPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(nivelLabel)
												.addComponent(nivelTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(tEntendidoLabel)
										.addComponent(tEntendidoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addGap(19)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addComponent(analizarButton)
					.addContainerGap())
		);
		fondoPane.setLayout(gl_fondoPane);
	}
}
