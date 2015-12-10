package modulo2;

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
public class InterfazHacerPrestamo extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblISBN;
	private JLabel lblTelefono;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JTextField txtISBN;
	private JTextField txtTelefono;
	private JTextField txtFechaInicio;
	private JTextField txtFechaFin;
	private JLabel lblEstado;
	private JButton btnHacerPrestamo;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazHacerPrestamo frame = new InterfazHacerPrestamo();
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
	public InterfazHacerPrestamo() {
		setTitle("Hacer prestamo");
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
				lblISBN.setBounds(35, 48, 46, 14);
				panel.add(lblISBN);
			}
			{
				lblTelefono = new JLabel("Telefono");
				lblTelefono.setBounds(34, 91, 80, 14);
				panel.add(lblTelefono);
			}
			{
				lblFechaInicio = new JLabel("Fecha inicio");
				lblFechaInicio.setBounds(35, 130, 67, 14);
				panel.add(lblFechaInicio);
			}
			{
				lblFechaFin = new JLabel("Fecha fin");
				lblFechaFin.setBounds(35, 176, 67, 14);
				panel.add(lblFechaFin);
			}
			{
				txtISBN = new JTextField();
				txtISBN.setColumns(10);
				txtISBN.setBounds(112, 45, 86, 20);
				panel.add(txtISBN);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(112, 88, 86, 20);
				panel.add(txtTelefono);
			}
			{
				txtFechaInicio = new JTextField();
				txtFechaInicio.setColumns(10);
				txtFechaInicio.setBounds(112, 127, 86, 20);
				panel.add(txtFechaInicio);
			}
			{
				txtFechaFin = new JTextField();
				txtFechaFin.setText("");
				txtFechaFin.setColumns(10);
				txtFechaFin.setBounds(112, 173, 86, 20);
				panel.add(txtFechaFin);
			}
			{
				lblEstado = new JLabel("");
				lblEstado.setOpaque(true);
				lblEstado.setBackground(Color.WHITE);
				lblEstado.setBounds(0, 227, 424, 25);
				panel.add(lblEstado);
			}
			{
				btnHacerPrestamo = new JButton("Hacer prestamo");
				btnHacerPrestamo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtISBN.getText()==null){
							lblEstado.setText("Debe introducir el isbn");
							return;
						}
						else{
							try {
								GestorPrestamos g1=new GestorPrestamos();
								GestorLibros g2=new GestorLibros();
								g1.hacerPrestamo(txtISBN.getText(), txtTelefono.getText(),txtFechaInicio.getText(),txtFechaFin.getText());
								g2.modificarEjemplaresSumar(txtISBN.getText());
								lblEstado.setText("Prestamo realizado correctamente");
							} catch (Exception e1) {
								lblEstado.setText(e1.toString());
							}
						}
					}
				});
				btnHacerPrestamo.setBounds(225, 126, 131, 23);
				panel.add(btnHacerPrestamo);
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
				btnAtras.setBounds(225, 172, 131, 23);
				panel.add(btnAtras);
			}
		}
	}

}
