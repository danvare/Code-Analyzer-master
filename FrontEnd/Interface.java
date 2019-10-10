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
		GroupLayout gl_fondoPane = new GroupLayout(fondoPane);
		gl_fondoPane.setHorizontalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addComponent(analizarButton, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buscarButton, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLabel_1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLabel_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(comboBox_2, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_1, Alignment.LEADING, 0, 186, Short.MAX_VALUE))
						.addComponent(lblLabel_3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(438, Short.MAX_VALUE))
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLabel_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fondoPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(comboBox_5, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_4, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_3, Alignment.LEADING, 0, 178, Short.MAX_VALUE))
						.addComponent(lblLabel_5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(446, Short.MAX_VALUE))
		);
		gl_fondoPane.setVerticalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buscarButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLabel)
					.addGap(8)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblLabel_1)
					.addGap(9)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblLabel_2)
					.addGap(11)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblLabel_4)
					.addGap(8)
					.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(lblLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(analizarButton))
		);
		fondoPane.setLayout(gl_fondoPane);
	}
}
