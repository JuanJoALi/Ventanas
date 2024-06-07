package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class FrmProducto {

	private JFrame frame;
	private JTextField txtNombreProducto;
	private JTextField txtCodigoProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProducto window = new FrmProducto();
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
	public FrmProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 505, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre del producto:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(39, 85, 207, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Código:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(39, 120, 121, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Cantidad:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2_1.setBounds(39, 157, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(211, 84, 200, 28);
		frame.getContentPane().add(txtNombreProducto);
		
		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCodigoProducto.setColumns(10);
		txtCodigoProducto.setBounds(110, 119, 207, 23);
		frame.getContentPane().add(txtCodigoProducto);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCrear.setBounds(174, 207, 89, 23);
		frame.getContentPane().add(btnCrear);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESAR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(11, 60, 88, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNuevoProducto = new JLabel("Nuevo Producto");
		lblNuevoProducto.setHorizontalAlignment(SwingConstants.LEFT);
		lblNuevoProducto.setFont(new Font("Javanese Text", Font.BOLD, 20));
		lblNuevoProducto.setBounds(10, 21, 297, 25);
		frame.getContentPane().add(lblNuevoProducto);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(-329, -3, 922, 14);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(-329, 271, 922, 10);
		frame.getContentPane().add(panel_2);
		
		JButton btnMen = new JButton("Menú\r\n");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu.main(null);
				frame.dispose();
			}
		});
		btnMen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMen.setBounds(11, 250, 85, 21);
		frame.getContentPane().add(btnMen);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(120, 155, 55, 25);
		frame.getContentPane().add(spinner);
	}
}
