package modulo1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import modulo2.InterfazHacerPrestamo;
import modulo4.*;
import modulo5.*;
import modulo6.*;
import modulo7.*;
import modulo8.*;
import modulo9.*;


public class InterfazGestionarBiblioteca extends JFrame {

	private JPanel contentPane;
	private JButton btnHacerPrestamo;
	private JButton btnEliminarPrestamo;
	private JButton btnModificarPrestamo;
	private JButton btnBuscarPrestamo;
	private JLabel lblEstado;
	private JButton btnAnadirLibro;
	private JButton btnModificarLibro;
	private JButton btnBuscarLibro;
	private JButton btnEliminarLibro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGestionarBiblioteca frame = new InterfazGestionarBiblioteca();
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
	public InterfazGestionarBiblioteca() {
		setTitle("Gestionar biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnHacerPrestamo = new JButton("Hacer prestamo");
			btnHacerPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazHacerPrestamo i=new InterfazHacerPrestamo();
					i.setVisible(true);
					dispose();
				}
			});
			btnHacerPrestamo.setBounds(247, 36, 144, 23);
			contentPane.add(btnHacerPrestamo);
		}
		{
			btnEliminarPrestamo = new JButton("Eliminar prestamo");
			btnEliminarPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazEliminarPrestamo i=new InterfazEliminarPrestamo();
					i.setVisible(true);
					dispose();
				}
			});
			btnEliminarPrestamo.setBounds(247, 176, 144, 23);
			contentPane.add(btnEliminarPrestamo);
		}
		{
			btnModificarPrestamo = new JButton("Modificar prestamo");
			btnModificarPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazModificarPrestamo i=new InterfazModificarPrestamo();
					i.setVisible(true);
					dispose();
				}
			});
			btnModificarPrestamo.setBounds(247, 85, 156, 23);
			contentPane.add(btnModificarPrestamo);
		}
		{
			btnBuscarPrestamo = new JButton("Buscar prestamo");
			btnBuscarPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazBuscarPrestamo i=new InterfazBuscarPrestamo();
					i.setVisible(true);
					dispose();
				}
			});
			btnBuscarPrestamo.setBounds(247, 130, 144, 23);
			contentPane.add(btnBuscarPrestamo);
		}
		{
			lblEstado = new JLabel("");
			lblEstado.setBackground(Color.WHITE);
			lblEstado.setOpaque(true);
			lblEstado.setBounds(0, 217, 434, 45);
			contentPane.add(lblEstado);
		}
		{
			btnAnadirLibro = new JButton("Añadir libro");
			btnAnadirLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazAñadirLibro i=new InterfazAñadirLibro();
					i.setVisible(true);
					dispose();
				}
			});
			btnAnadirLibro.setBounds(37, 36, 123, 23);
			contentPane.add(btnAnadirLibro);
		}
		{
			btnModificarLibro = new JButton("Modificar libro");
			btnModificarLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazModificarLibro i=new InterfazModificarLibro();
					i.setVisible(true);
					dispose();
				}
			});
			btnModificarLibro.setBounds(37, 85, 123, 23);
			contentPane.add(btnModificarLibro);
		}
		{
			btnBuscarLibro = new JButton("Buscar libro");
			btnBuscarLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazBuscarLibro i=new InterfazBuscarLibro();
					i.setVisible(true);
					dispose();
				}
			});
			btnBuscarLibro.setBounds(37, 130, 123, 23);
			contentPane.add(btnBuscarLibro);
		}
		{
			btnEliminarLibro = new JButton("Eliminar libro");
			btnEliminarLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InterfazEliminarLibro i=new InterfazEliminarLibro();
					i.setVisible(true);
					dispose();
				}
			});
			btnEliminarLibro.setBounds(37, 176, 123, 23);
			contentPane.add(btnEliminarLibro);
		}
	}
}
