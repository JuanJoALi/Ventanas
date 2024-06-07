package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class FrmCambioClave extends FrmPantallaInicio{

	private JFrame frame;
	private JTextField txtContraseña;
	private JTextField txtNuevaCon;
	private JTextField txtNuevaCon2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCambioClave window = new FrmCambioClave();
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
	public FrmCambioClave() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 707, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnMen = new JButton("Menú\r\n");
		btnMen.setBounds(10, 232, 85, 21);
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu.main(null);
				frame.dispose();//cierra la ventana
			}
		});
		frame.getContentPane().setLayout(null);
		btnMen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(btnMen);
		
		JLabel lblCambioDeContrasea = new JLabel("Cambio de Contraseña");
		lblCambioDeContrasea.setHorizontalAlignment(SwingConstants.LEFT);
		lblCambioDeContrasea.setFont(new Font("Javanese Text", Font.BOLD, 20));
		lblCambioDeContrasea.setBounds(10, 20, 297, 25);
		frame.getContentPane().add(lblCambioDeContrasea);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar antigua contraseña:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(48, 70, 247, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresar nueva contraseña:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(48, 116, 247, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingresar nueva contraseña(de nuevo):");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(48, 164, 297, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(281, 74, 229, 19);
		frame.getContentPane().add(txtContraseña);
		
		txtNuevaCon = new JTextField();
		txtNuevaCon.setColumns(10);
		txtNuevaCon.setBounds(281, 120, 229, 19);
		frame.getContentPane().add(txtNuevaCon);
		
		txtNuevaCon2 = new JTextField();
		txtNuevaCon2.setColumns(10);
		txtNuevaCon2.setBounds(355, 168, 229, 19);
		frame.getContentPane().add(txtNuevaCon2);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String con= txtContraseña.getText();
				String nueva= txtNuevaCon.getText();
				String nuevaAgain= txtNuevaCon2.getText();
				if(con.equals(clave) && nueva.equals(nuevaAgain)) {
					JOptionPane.showMessageDialog(null,"Contraseña cambiada con exito.","Exitoso",JOptionPane.INFORMATION_MESSAGE);
					setClave(con);
					frame.dispose();
					//FrmPantallaInicio.main(null);
					
				}
			}
		});
		btnAplicar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAplicar.setBounds(310, 216, 85, 21);
		frame.getContentPane().add(btnAplicar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(-209, 0, 922, 14);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(-209, 253, 922, 10);
		frame.getContentPane().add(panel_2);
	}
}
