package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class FrmPantallaInicio {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPantallaInicio window = new FrmPantallaInicio();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmPantallaInicio() throws SQLException{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(10, 10, 593, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(200, 0, 393, 382);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 136, 72, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(30, 193, 86, 26);
		panel_1.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(112, 136, 214, 26);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		
		txtPassword.setBounds(119, 193, 207, 26);
		panel_1.add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = txtUsuario.getText();
				String password= txtPassword.getText();
				
				if((user.equals("Jose") && password.equals("123")) || (user.equals("Juan") && password.equals("Huangho19") ) || 
						(user.equals("Profe") && password.equals("1") )) {
					txtPassword.setText(null);
					txtUsuario.setText(null);
					
					//Menu menu =new Menu();
					Menu.main(null);
					//menu.main(null); es lo mismo
					frame.dispose();//cierra la ventana
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Error al ingresar el usuario o la contraseña.","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsuario.setText(null);
				}
			}
		});
		btnNewButton.setBounds(112, 290, 104, 26);
		panel_1.add(btnNewButton);
		
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\Fondo.jpeg"));
		lblFondo.setBounds(0, 0, 393, 382);
		panel_1.add(lblFondo);
		
		JLabel lblControlDeInventarios = new JLabel("");
		lblControlDeInventarios.setBackground(new Color(255, 255, 0));
		lblControlDeInventarios.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\Titulov2.jpeg"));
		lblControlDeInventarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblControlDeInventarios.setFont(new Font("Javanese Text", Font.BOLD, 20));
		lblControlDeInventarios.setBounds(0, 70, 240, 120);
		panel.add(lblControlDeInventarios);
		
		JLabel lblFondo2 = new JLabel("New label");
		lblFondo2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\Fondo2.jpeg"));
		lblFondo2.setBounds(-108, 0, 593, 382);
		panel.add(lblFondo2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\MaderaOscura.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 613, 402);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 627, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
