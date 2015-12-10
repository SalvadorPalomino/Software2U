package modulo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InterfazAñadirLibro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblISBN;
	private JLabel lblTitulo;
	private JLabel lblAutor;
	private JLabel lblEditorial;
	private JTextField txtISBN;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEditorial;
	private JLabel lblEstado;
	private JButton btnAnadirLibro;
	private JLabel lblEjemplares;
	private JTextField txtEjemplares;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAñadirLibro frame = new InterfazAñadirLibro();
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
	public InterfazAñadirLibro() {
		setTitle("Añadir libro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				lblISBN = new JLabel("ISBN");
				lblISBN.setBounds(47, 22, 46, 14);
				panel.add(lblISBN);
			}
			{
				lblTitulo = new JLabel("Titulo");
				lblTitulo.setBounds(47, 53, 46, 14);
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
				txtISBN.setBounds(112, 19, 86, 20);
				panel.add(txtISBN);
				txtISBN.setColumns(10);
			}
			{
				txtTitulo = new JTextField();
				txtTitulo.setBounds(112, 50, 86, 20);
				panel.add(txtTitulo);
				txtTitulo.setColumns(10);
			}
			{
				txtAutor = new JTextField();
				txtAutor.setBounds(112, 88, 86, 20);
				panel.add(txtAutor);
				txtAutor.setColumns(10);
			}
			{
				txtEditorial = new JTextField();
				txtEditorial.setText("");
				txtEditorial.setBounds(112, 127, 86, 20);
				panel.add(txtEditorial);
				txtEditorial.setColumns(10);
			}
			{
				lblEstado = new JLabel("");
				lblEstado.setBackground(Color.WHITE);
				lblEstado.setOpaque(true);
				lblEstado.setBounds(0, 227, 424, 25);
				panel.add(lblEstado);
			}
			{
				btnAnadirLibro = new JButton("Añadir libro");
				btnAnadirLibro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtISBN.getText()==null){
							lblEstado.setText("Debe introducir al menos el isbn");
							return;
						}
						else{
							try {
								GestorLibros g=new GestorLibros();
								g.añadirLibro(txtISBN.getText(), txtTitulo.getText(), txtAutor.getText(), txtEditorial.getText(), txtEjemplares.getText());
								lblEstado.setText("Libro añadido correctamente");
							} catch (Exception e1) {
								lblEstado.setText(e1.toString());
							}
						}
					}
				});
				btnAnadirLibro.setBounds(219, 87, 109, 23);
				panel.add(btnAnadirLibro);
			}
			
			JButton btnAtras = new JButton("Atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazGestionarBiblioteca i=new InterfazGestionarBiblioteca();
					i.setVisible(true);
					dispose();
				}
			});
			btnAtras.setBounds(219, 142, 109, 23);
			panel.add(btnAtras);
			{
				lblEjemplares = new JLabel("Ejemplares");
				lblEjemplares.setBounds(23, 173, 70, 14);
				panel.add(lblEjemplares);
			}
			{
				txtEjemplares = new JTextField();
				txtEjemplares.setBounds(112, 170, 86, 20);
				panel.add(txtEjemplares);
				txtEjemplares.setColumns(10);
			}
		}
	}
}
