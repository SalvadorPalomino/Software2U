package modulo4;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import modulo1.*;


public class InterfazBuscarLibro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblISBN;
	private JLabel lblTitulo;
	private JLabel lblAutor;
	private JLabel lblEditorial;
	private JTextField txtISBN;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEditorial;
	private JLabel lblEstado;
	private JButton btnBuscarLibro;
	private JLabel lblEjemplares;
	private JTextField txtEjemplares;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazBuscarLibro frame = new InterfazBuscarLibro();
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
	public InterfazBuscarLibro() {
		setTitle("Buscar libro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(5, 5, 424, 252);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBounds(0, 0, 424, 252);
				panel.add(panel_1);
				{
					lblISBN = new JLabel("ISBN");
					lblISBN.setBounds(47, 26, 46, 14);
					panel_1.add(lblISBN);
				}
				{
					lblTitulo = new JLabel("Titulo");
					lblTitulo.setBounds(47, 61, 46, 14);
					panel_1.add(lblTitulo);
				}
				{
					lblAutor = new JLabel("Autor");
					lblAutor.setBounds(47, 97, 46, 14);
					panel_1.add(lblAutor);
				}
				{
					lblEditorial = new JLabel("Editorial");
					lblEditorial.setBounds(47, 130, 46, 14);
					panel_1.add(lblEditorial);
				}
				{
					txtISBN = new JTextField();
					txtISBN.setColumns(10);
					txtISBN.setBounds(112, 23, 86, 20);
					panel_1.add(txtISBN);
				}
				{
					txtTitulo = new JTextField();
					txtTitulo.setColumns(10);
					txtTitulo.setBounds(112, 58, 86, 20);
					panel_1.add(txtTitulo);
				}
				{
					txtAutor = new JTextField();
					txtAutor.setColumns(10);
					txtAutor.setBounds(112, 94, 86, 20);
					panel_1.add(txtAutor);
				}
				{
					txtEditorial = new JTextField();
					txtEditorial.setText("");
					txtEditorial.setColumns(10);
					txtEditorial.setBounds(112, 127, 86, 20);
					panel_1.add(txtEditorial);
				}
				{
					lblEstado = new JLabel("");
					lblEstado.setOpaque(true);
					lblEstado.setBackground(Color.WHITE);
					lblEstado.setBounds(0, 227, 424, 25);
					panel_1.add(lblEstado);
				}
				{
					btnBuscarLibro = new JButton("Buscar libro");
					btnBuscarLibro.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(txtISBN.getText()==null){
								lblEstado.setText("Debe introducir el isbn");
								return;
							}
							else{
								try {
									GestorLibros g=new GestorLibros();
									String cad=g.buscarLibro(txtISBN.getText());
									String[] separada = cad.split("/"); 									
									txtTitulo.setText(separada[0]);
									txtAutor.setText(separada[1]);
									txtEditorial.setText(separada[2]);
									txtEjemplares.setText(separada[3]);
								} catch (Exception e1) {
									lblEstado.setText(e1.toString());
								}
							}
						}
					});
					btnBuscarLibro.setBounds(219, 93, 122, 23);
					panel_1.add(btnBuscarLibro);
				}
				{
					lblEjemplares = new JLabel("Ejemplares");
					lblEjemplares.setBounds(35, 165, 66, 14);
					panel_1.add(lblEjemplares);
				}
				{
					txtEjemplares = new JTextField();
					txtEjemplares.setBounds(112, 162, 86, 20);
					panel_1.add(txtEjemplares);
					txtEjemplares.setColumns(10);
				}
				{
					btnAtras = new JButton("Atras");
					btnAtras.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							InterfazGestionarBiblioteca i=new InterfazGestionarBiblioteca();
							i.setVisible(true);
							dispose();
						}
					});
					btnAtras.setBounds(219, 143, 122, 23);
					panel_1.add(btnAtras);
				}
			}
			{
				
			}
		}
	}
}
