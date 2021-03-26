package ejercicio_5;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	public static JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Libros libro1 = new Libros("Alofoke",true,false);
		libro1.setNombre("El Titanic");
		libro1.setOriginal(false);
		libro1.setPrestable(false);
		
		
		Libros libro2 = new Libros("Selva de Cemento",false,true);
		libro2.setNombre("Interestellar");
		libro2.setOriginal(true);
		libro2.setPrestable(false);
		
		Array.add(libro1);
		Array.add(libro2);
		
		Array.add(new Libros("Terminator",false,true));
		Array.add(new Libros("John Wick",true,true));
		Array.add(new Libros("John Wick 2",false,true));
		Array.add(new Libros("John Wick 3",true,false));
		
		
		

		// imprimir libros originales
		System.out.println("Los libros originales son:\n");
		
		for(Libros exa :libro1.getOriginal())
		{
			System.out.println("* " + exa.getNombre());
		}
		System.out.println("-----------------------------------");
		
		
		// imprimir libros prestables
		System.out.println("Los libros prestables son:\n");
		for(Libros exa :libro1.getPrestable())
		{
			System.out.println("* " + exa.getNombre());
		}
		System.out.println("-----------------------------------");
		
		
		System.out.println("El titanic es original: " + libro1.isOriginal());
		System.out.println("El titanic se puede prestar: " + libro1.isPrestable());
	}

	
	public Ventana() {
		initialize();
	}

	public DefaultTableModel modelo = new DefaultTableModel();
	public static JTable tabla;
	public static JTextField textField_1_2;
	public static JCheckBox CheckBox1_3;
	public static JCheckBox CheckBox_1_6;
	public static JPanel panel_2;
	static DefaultTableModel model;
	public static Object panel_1;
	
	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Real Libreria");
		
		
		JLabel lblNewLabel = new JLabel("Real Libreria");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(279, 10, 124, 19);
		frame.getContentPane().add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel_2.setBounds(239, 39, 378, 170);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		model = new DefaultTableModel(Array.getArrayObject(),Array.nombreColumnas);
		tabla = new JTable(model);
		Ventana.panel_2.add(new JScrollPane(Ventana.tabla));
		
		//----------------------------------------------------
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 25, 205, 215);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Label_1_1 = new JLabel("Nombre Libro");
		Label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label_1_1.setBounds(51, 10, 110, 16);
		panel_1.add(Label_1_1);
		
		textField_1_2 = new JTextField();
		textField_1_2.setBounds(10, 36, 185, 19);
		panel_1.add(textField_1_2);
		textField_1_2.setColumns(10);
		
		
		
		
		CheckBox1_3 = new JCheckBox(" ");
		CheckBox1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CheckBox1_3.setBounds(119, 72, 17, 18);
		panel_1.add(CheckBox1_3);
		
		JLabel Label_1_4 = new JLabel("Original");
		Label_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label_1_4.setBounds(35, 73, 67, 16);
		panel_1.add(Label_1_4);
		
		JLabel Label_1_5 = new JLabel("Prestable");
		Label_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label_1_5.setBounds(35, 108, 67, 16);
		panel_1.add(Label_1_5);
		
		CheckBox_1_6 = new JCheckBox("");
		CheckBox_1_6.setBounds(119, 108, 21, 21);
		panel_1.add(CheckBox_1_6);
		
		JButton Button_1_7 = new JButton("Agregar");
		
		Button_1_7.addActionListener(new EventoClickGuardar());
		
		
		Button_1_7.setBounds(10, 153, 92, 21);
		panel_1.add(Button_1_7);
		
		JButton Button_1_8 = new JButton("Borrar Todo");
		Button_1_8.addActionListener(new EventoClickBorrarTodo());
		Button_1_8.setBounds(51, 184, 110, 21);
		panel_1.add(Button_1_8);
		
		JButton Button_1_9 = new JButton("Borrar");
		Button_1_9.addActionListener(new EventoClickBorrar());
		
		Button_1_9.setBounds(112, 153, 85, 21);
		panel_1.add(Button_1_9);
	
		
		
		
		
		
		
		
	
	}
}




