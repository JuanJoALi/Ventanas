package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FrmEliminar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEliminar window = new FrmEliminar();
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
	public FrmEliminar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 563, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(-332, 0, 922, 14);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(-305, 273, 922, 10);
		frame.getContentPane().add(panel_2);
		
		JButton btnMen = new JButton("Menú\r\n");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu.main(null);
				frame.dispose();//cierra la ventana
			}
		});
		btnMen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMen.setBounds(10, 250, 85, 21);
		frame.getContentPane().add(btnMen);
		
		JLabel lblEliminarProductos = new JLabel("Eliminar Productos");
		lblEliminarProductos.setHorizontalAlignment(SwingConstants.LEFT);
		lblEliminarProductos.setFont(new Font("Javanese Text", Font.BOLD, 20));
		lblEliminarProductos.setBounds(10, 24, 297, 25);
		frame.getContentPane().add(lblEliminarProductos);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre del producto:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(31, 81, 207, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Código:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(31, 116, 121, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Cantidad:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2_1.setBounds(31, 153, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(112, 151, 55, 25);
		frame.getContentPane().add(spinner);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(102, 115, 207, 23);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(203, 80, 200, 28);
		frame.getContentPane().add(textField_1);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEliminar.setBounds(203, 203, 104, 23);
		frame.getContentPane().add(btnEliminar);
	}

}
