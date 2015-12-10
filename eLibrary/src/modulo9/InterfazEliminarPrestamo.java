package modulo9;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modulo2.*;
import modulo1.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazEliminarPrestamo extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblISBN;
	private JTextField txtISBN;
	private JLabel lblEstado;
	private JButton btnEliminarPrestamo;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarPrestamo frame = new InterfazEliminarPrestamo();
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
	public InterfazEliminarPrestamo() {
		setTitle("Eliminar prestamo");
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
				lblISBN.setBounds(60, 120, 46, 14);
				panel.add(lblISBN);
			}
			{
				txtISBN = new JTextField();
				txtISBN.setColumns(10);
				txtISBN.setBounds(116, 117, 86, 20);
				panel.add(txtISBN);
			}
			{
				lblEstado = new JLabel("");
				lblEstado.setOpaque(true);
				lblEstado.setBackground(Color.WHITE);
				lblEstado.setBounds(0, 227, 424, 25);
				panel.add(lblEstado);
			}
			{
				btnEliminarPrestamo = new JButton("Eliminar prestamo");
				btnEliminarPrestamo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtISBN.getText()==null){
							lblEstado.setText("Debe introducir el isbn");
							return;
						}
						else{
							try {
								GestorPrestamos g1=new GestorPrestamos();
								GestorLibros g2=new GestorLibros();
								g1.eliminarPrestamo(txtISBN.getText());
								g2.modificarEjemplaresRestar(txtISBN.getText());
								lblEstado.setText("Prestamo eliminado correctamente");
							} catch (Exception e1) {
								lblEstado.setText(e1.toString());
							}
						}
					}
				});
				btnEliminarPrestamo.setBounds(222, 116, 144, 23);
				panel.add(btnEliminarPrestamo);
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
				btnAtras.setBounds(222, 152, 144, 23);
				panel.add(btnAtras);
			}
		}
	}
}
