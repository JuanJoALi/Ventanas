package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.proyecto.models.Producto;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu {

	private JFrame frame;
	private JTable TablaProductos;
	private DefaultTableModel model;
	private JTextField txtBusqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() throws SQLException  {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  throws SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 987, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistro = new JLabel("Inventario de productos\r\n");
		lblRegistro.setBounds(44, 24, 395, 33);
		lblRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegistro.setFont(new Font("Lucida Handwriting", Font.BOLD, 24));
		frame.getContentPane().add(lblRegistro);
		
		JButton btnEliminar = new JButton("Eliminar Producto");
		btnEliminar.setBounds(44, 262, 259, 33);
		/*btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmEliminar ventanaEliminar= new FrmEliminar();
				FrmEliminar.main(null);
				//
			}
		});*/
		btnEliminar.setBackground(SystemColor.window);
		btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminar.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		frame.getContentPane().add(btnEliminar);
		
		JButton btnIngresar = new JButton("Crear nuevo producto");
		btnIngresar.setBounds(44, 113, 259, 33);
		btnIngresar.setHorizontalAlignment(SwingConstants.LEFT);
		btnIngresar.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnIngresar.setBackground(SystemColor.window);
		/*btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmProducto ventanaProducto= new FrmProducto();
				FrmProducto.main(null);
				//frame.dispose();
			}
		});*/
		frame.getContentPane().add(btnIngresar);
		
		JButton btnBuscar = new JButton("Buscar:");
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.setBounds(44, 186, 95, 35);
		btnBuscar.setBackground(SystemColor.window);
		btnBuscar.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		/*btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmBusqueda ventanaBusqueda= new FrmBusqueda();
				FrmBusqueda.main(null);
				//frame.dispose();
			}
		});*/
		frame.getContentPane().add(btnBuscar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 973, 14);
		panel.setBackground(new Color(154, 205, 50));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(486, 5, 0, 0);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(135, 206, 250));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\MaderaOscura.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 983, 27);
		panel.add(lblNewLabel_2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setHorizontalAlignment(SwingConstants.LEFT);
		btnSalir.setBounds(39, 418, 148, 33);
		btnSalir.setBackground(SystemColor.window);
		btnSalir.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSalir);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 461, 973, 10);
		panel_2.setBackground(new Color(255, 165, 0));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\r\n");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\MaderaOscura.jpeg"));
		lblNewLabel_3.setBounds(-24, -16, 1030, 26);
		panel_2.add(lblNewLabel_3);
		
		
		String[] columnNames = { "ID_producto", "Nombre", "Descripcion", "Precio","Stock" };
		model =  new DefaultTableModel(columnNames, 0);
		
		TablaProductos = new JTable(model);
		TablaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		TablaProductos.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(TablaProductos);
		scrollPane.setBounds(402, 93, 543, 290);
		frame.getContentPane().add(scrollPane);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setToolTipText(null);
		txtBusqueda.setBackground(SystemColor.textHighlightText);
		txtBusqueda.setToolTipText("Nombre o Descripción.");
		txtBusqueda.setFont(new Font("Footlight MT Light", Font.PLAIN, 16));
		txtBusqueda.setBounds(143, 189, 160, 24);
		frame.getContentPane().add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar Producto");
		btnModificar.setBackground(SystemColor.window);
		btnModificar.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnModificar.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificar.setBounds(44, 339, 259, 33);
		frame.getContentPane().add(btnModificar);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Ventanas\\src\\Imagenes\\NuvesmasG.jpeg"));
		lblNewLabel_4.setBounds(0, 10, 973, 461);
		frame.getContentPane().add(lblNewLabel_4);
		
		cargarDatos(0);
		
		btnBuscar.addActionListener(e -> {
			try {
				buscarProducto(txtBusqueda.getText());
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		});
		
		btnIngresar.addActionListener(e -> {
			try {
				insertarProducto();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		});
		
		btnEliminar.addActionListener(e -> {
			try {
				eliminarProducto();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		});
		
		btnModificar.addActionListener(e -> {
			try {
				modificarProducto();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		});
		
	}
	
	private void cargarDatos(int productoId) throws SQLException {
		List<Producto> lista = new ArrayList<Producto>();

		Connection con = com.proyecto.database.Conexion.getInstance().getConnection();
		String consulta = "SELECT ID_producto, nombre, descripcion, precio, stock " + "FROM productos " 
				+ "WHERE ID_producto>?";
		PreparedStatement pst = con.prepareStatement(consulta);
		pst.setInt(1, productoId);
		ResultSet rs = pst.executeQuery();
		System.out.println(pst.toString());

		while (rs.next()) {
			Producto a = new Producto();
			a.setProductId(rs.getInt("ID_producto"));
			a.setProductName(rs.getString("nombre"));
			a.setProductDescription(rs.getString("descripcion"));
			a.setProductPrice(rs.getDouble("precio"));
			a.setProductStock(rs.getInt("stock"));
			lista.add(a);
		}

		// Limpiar el modelo
		model.setRowCount(0);

		// Agregar datos al modelo
		for (Producto producto : lista) {
			Object[] row = { producto.getProductId(), producto.getProductName(), producto.getProductDescription(), producto.getProductPrice(), producto.getProductStock() };
			model.addRow(row);
		}
	}
	
	private void insertarProducto() throws SQLException {
		int Id_producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id nombre:"));
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
		String descripcion= JOptionPane.showInputDialog("Ingrese el descripcion:");
		double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));
		int stock= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock:"));
		if (Id_producto == 0 || nombre == null || descripcion == null || precio==0 || stock == 0) {
			return;
		}

		Connection con = com.proyecto.database.Conexion.getInstance().getConnection();
		String consulta = "INSERT INTO productos (ID_producto, nombre, descripcion, precio, stock) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement pst = con.prepareStatement(consulta);
		pst.setInt(1, Id_producto);
		pst.setString(2, nombre);
		pst.setString(3, descripcion);
		pst.setDouble(4, precio);
		pst.setInt(5, stock);
		int rowsAffected = pst.executeUpdate();
		System.out.println(pst.toString());

		if (rowsAffected > 0) {
			JOptionPane.showMessageDialog(TablaProductos,"Registro ingresado!");
			cargarDatos(0);
		}
	}
	
	private void eliminarProducto() throws SQLException {
		int selectedRow = TablaProductos.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(TablaProductos, "Seleccione un registro para eliminar.");
			return;
		}

		int ID_producto = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
		
		Connection con = com.proyecto.database.Conexion.getInstance().getConnection();
		String consulta = "DELETE FROM productos WHERE ID_producto = ?";
		PreparedStatement pst = con.prepareStatement(consulta);
		pst.setInt(1, ID_producto);
		int rowsAffected = pst.executeUpdate();
		System.out.println(pst.toString());
		if (rowsAffected > 0) {
			JOptionPane.showMessageDialog(TablaProductos, "Producto eliminado exitosamente.");
			cargarDatos(0);
		}
	}
	
	private void buscarProducto(String criterio) throws SQLException {
		List<Producto> lista = new ArrayList<Producto>();

		Connection con = com.proyecto.database.Conexion.getInstance().getConnection();
		String consulta = "SELECT ID_producto, nombre, descripcion, precio, stock " + " FROM productos "
				+ " WHERE nombre LIKE ? OR descripcion LIKE ? ";
		PreparedStatement pst = con.prepareStatement(consulta);
		pst.setString(1, "%" + criterio + "%");
		pst.setString(2, "%" + criterio + "%");
		ResultSet rs = pst.executeQuery();
		System.out.println(pst.toString());

		while (rs.next()) {
			Producto a = new Producto();
			a.setProductId(rs.getInt("ID_producto"));
			a.setProductName(rs.getString("nombre"));
			a.setProductDescription(rs.getString("descripcion"));
			a.setProductPrice(rs.getDouble("precio"));
			a.setProductStock(rs.getInt("stock"));
			lista.add(a);
		}

		// Limpiar el modelo
		model.setRowCount(0);

		// Agregar datos al modelo
		for (Producto producto : lista) {
			Object[] row = { producto.getProductId(), producto.getProductName(), producto.getProductDescription(), producto.getProductPrice(), producto.getProductStock() };
			model.addRow(row);
		}
	}
	
	private void modificarProducto() throws SQLException {
		int selectedRow = TablaProductos.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(TablaProductos, "Seleccione un registro para modificar.");
			return;
		}
		int ID_producto = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

		String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
		String descripcion= JOptionPane.showInputDialog("Ingrese la nueva descripcion:");
		
		double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio:"));
		int stock= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo stock:"));
		
		if (nombre == null || descripcion == null  || precio== 0 || stock == 0) {
			return;
		}

		Connection con = com.proyecto.database.Conexion.getInstance().getConnection();
		String consulta = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, stock= ? "
				+ " WHERE ID_producto = ?";
		PreparedStatement pst = con.prepareStatement(consulta);
		pst.setString(1, nombre);
		pst.setString(2, descripcion);
		pst.setDouble(3, precio);
		pst.setInt(4, stock);
		pst.setInt(5, ID_producto);
		int rowsAffected = pst.executeUpdate();
		System.out.println(pst.toString());

		if (rowsAffected > 0) {
			JOptionPane.showMessageDialog( TablaProductos, "Producto modificado exitosamente.");
			cargarDatos(0);
		}
	}
}

