package modulo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import modulo1.*;

public class InterfazAutenticarse {

	private JFrame frmAutenticacion;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private JTextField txtUsuario;
	private JPasswordField pwdContraseña;
	private JButton btnAutenticarse;
	private JLabel lblEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAutenticarse window = new InterfazAutenticarse();
					window.frmAutenticacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazAutenticarse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAutenticacion = new JFrame();
		frmAutenticacion.setTitle("Autenticacion");
		frmAutenticacion.setBounds(100, 100, 450, 300);
		frmAutenticacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutenticacion.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 434, 262);
			frmAutenticacion.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblUsuario = new JLabel("Usuario");
				lblUsuario.setBounds(35, 76, 46, 14);
				panel.add(lblUsuario);
				lblUsuario.setOpaque(true);
			}
			{
				lblContraseña = new JLabel("Contraseña");
				lblContraseña.setOpaque(true);
				lblContraseña.setBounds(35, 128, 70, 14);
				panel.add(lblContraseña);
			}
			{
				txtUsuario = new JTextField();
				txtUsuario.setBounds(124, 73, 86, 20);
				panel.add(txtUsuario);
				txtUsuario.setColumns(10);
			}
			{
				pwdContraseña = new JPasswordField();
				pwdContraseña.setBounds(124, 125, 86, 20);
				panel.add(pwdContraseña);
			}
			{
				btnAutenticarse = new JButton("Autenticarse");
				btnAutenticarse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
											
						if(txtUsuario.getText().equals("") || pwdContraseña.getText().equals("")){
							lblEstado.setText("Debe introducir un usuario y una contraseña");
							return;							
						}
						
						try {
							
							GestorUsuarios g=new GestorUsuarios();
							
							if(pwdContraseña.getText().equals(g.autenticarse(txtUsuario.getText()))){									
								InterfazGestionarBiblioteca i=new InterfazGestionarBiblioteca();
								i.setVisible(true);
								frmAutenticacion.dispose();
							}
							else{
							lblEstado.setText("Autenticacion incorrecta: no existe ningún usuario con esa contraseña");
							}
							} catch (Exception e1) {
								lblEstado.setText(e1.toString());
					}
					}	
				});
				btnAutenticarse.setBounds(255, 104, 110, 23);
				panel.add(btnAutenticarse);
			}
			{
				lblEstado = new JLabel("");
				lblEstado.setBackground(Color.WHITE);
				lblEstado.setOpaque(true);
				lblEstado.setBounds(10, 192, 434, 37);
				panel.add(lblEstado);
			}
		}
	}	
}
