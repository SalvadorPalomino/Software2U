package modulo6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modulo1.*;

public class InterfazModificarLibro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblISBN;
	private JLabel lblTitulo;
	private JLabel lblAutor;
	private JLabel lblEditorial;
	private JTextField txtISBN;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JLabel lblEstado;
	private JButton btnModificarLibro;
	private JTextField txtEditorial;
	private JButton btnAtras;
	private JTextField txtEjemplares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarLibro frame = new InterfazModificarLibro();
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
	public InterfazModificarLibro() {
		setTitle("Modificar libro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			panel.setLayout(null);
			contentPane.add(panel, BorderLayout.CENTER);
			{
				lblISBN = new JLabel("ISBN");
				lblISBN.setBounds(47, 27, 46, 14);
				panel.add(lblISBN);
			}
			{
				lblTitulo = new JLabel("Titulo");
				lblTitulo.setBounds(47, 55, 46, 14);
				panel.add(lblTitulo);
			}
			{
				lblAutor = new JLabel("Autor");
				lblAutor.setBounds(47, 91, 46, 14);
				panel.add(lblAutor);
			}
			{
				lblEditorial = new JLabel("Editorial");
				lblEditorial.setBounds(47, 130, 46, 14);
				panel.add(lblEditorial);
			}
			{
				txtISBN = new JTextField();
				txtISBN.setColumns(10);
				txtISBN.setBounds(112, 24, 86, 20);
				panel.add(txtISBN);
			}
			{
				txtTitulo = new JTextField();
				txtTitulo.setColumns(10);
				txtTitulo.setBounds(112, 52, 86, 20);
				panel.add(txtTitulo);
			}
			{
				txtAutor = new JTextField();
				txtAutor.setColumns(10);
				txtAutor.setBounds(112, 88, 86, 20);
				panel.add(txtAutor);
			}
			{
				txtEditorial = new JTextField();
				txtEditorial.setText("");
				txtEditorial.setColumns(10);
				txtEditorial.setBounds(112, 127, 86, 20);
				panel.add(txtEditorial);
			}
			{
				lblEstado = new JLabel("");
				lblEstado.setOpaque(true);
				lblEstado.setBackground(Color.WHITE);
				lblEstado.setBounds(0, 227, 424, 25);
				panel.add(lblEstado);
			}
			{
				btnModificarLibro = new JButton("Modificar libro");
				btnModificarLibro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtISBN.getText()==null){
							lblEstado.setText("Debe introducir el isbn");
							return;
						}
						else{
							try {
								GestorLibros g=new GestorLibros();
								g.modificarLibro(txtISBN.getText(),txtTitulo.getText(),txtAutor.getText(),txtEditorial.getText(),txtEjemplares.getText());
								lblEstado.setText("Libro modificado correctamente");
							} catch (Exception e1) {
								lblEstado.setText(e1.toString());
							}
						}
					}
				});
				btnModificarLibro.setBounds(220, 126, 123, 23);
				panel.add(btnModificarLibro);
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
				btnAtras.setBounds(219, 160, 124, 23);
				panel.add(btnAtras);
			}
			
			JLabel lblEjemplares = new JLabel("Ejemplares");
			lblEjemplares.setBounds(34, 164, 65, 14);
			panel.add(lblEjemplares);
			
			txtEjemplares = new JTextField();
			txtEjemplares.setBounds(112, 158, 86, 20);
			panel.add(txtEjemplares);
			txtEjemplares.setColumns(10);
		}
	}
}
