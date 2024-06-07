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
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class FrmBusqueda {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBusqueda window = new FrmBusqueda();
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
	public FrmBusqueda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 521, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 922, 14);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(-237, 283, 922, 10);
		frame.getContentPane().add(panel_2);
		
		JButton btnMen = new JButton("Menú\r\n");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu.main(null);
				frame.dispose();//cierra la ventana
			}
		});
		btnMen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMen.setBounds(10, 262, 85, 21);
		frame.getContentPane().add(btnMen);
		
		JLabel lblBusquedaDeProductos = new JLabel("Busqueda de productos");
		lblBusquedaDeProductos.setHorizontalAlignment(SwingConstants.LEFT);
		lblBusquedaDeProductos.setFont(new Font("Javanese Text", Font.BOLD, 20));
		lblBusquedaDeProductos.setBounds(10, 24, 297, 25);
		frame.getContentPane().add(lblBusquedaDeProductos);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBuscar.setBounds(206, 207, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JComboBox Tipos_Productos = new JComboBox();
		Tipos_Productos.setForeground(new Color(0, 0, 0));
		Tipos_Productos.setBackground(new Color(144, 238, 144));
		Tipos_Productos.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		Tipos_Productos.setBounds(20, 65, 287, 25);
		frame.getContentPane().add(Tipos_Productos);
		Tipos_Productos.addItem("Selecciona tipo de Producto");
		Tipos_Productos.addItem("Frutas");
		Tipos_Productos.addItem("Lacteos");
		Tipos_Productos.addItem("Carnes");
		Tipos_Productos.addItem("Verduras");
	}
}
