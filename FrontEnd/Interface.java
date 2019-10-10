package FrontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class Interface extends JFrame {

	private JPanel fondoPane;
	private JTextField buscarTextField;
	private JButton analizarButton;

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
		GroupLayout gl_fondoPane = new GroupLayout(fondoPane);
		gl_fondoPane.setHorizontalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addComponent(analizarButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fondoPane.createSequentialGroup()
							.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buscarButton, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_fondoPane.setVerticalGroup(
			gl_fondoPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondoPane.createSequentialGroup()
					.addGroup(gl_fondoPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buscarTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buscarButton))
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
					.addComponent(analizarButton))
		);
		fondoPane.setLayout(gl_fondoPane);
	}
}
