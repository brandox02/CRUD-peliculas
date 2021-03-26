package ejercicio_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Eventos 
{

}
class EventoClickGuardar implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		String texto = Ventana.textField_1_2.getText();
		boolean original = Ventana.CheckBox1_3.isSelected();
		boolean prestable = Ventana.CheckBox_1_6.isSelected();
		
		Libros f = new Libros(texto,original,prestable);
		
		Array.add(f);
		
		
		try{
			Ventana.panel_2.removeAll();
		}catch(NullPointerException ex)
		{
			System.out.println("Lo ha capturau");
		}
		Ventana.tabla = new JTable(Array.getArrayObject(),Array.nombreColumnas);
		
		Ventana.panel_2.add(new JScrollPane(Ventana.tabla));
		Ventana.panel_2.validate();
		System.out.println(Array.getArrayString());
		
		
		
		
	}
	
	
}
class EventoClickBorrarTodo implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Ha entru");
		//Ventana.panel_2.removeAll();
		
		try{
			Ventana.panel_2.removeAll();
			Array.reiniciarArray();
			
		}catch(NullPointerException ex)
		{
			System.out.println("Lo ha capturau");
		}
		Ventana.tabla = new JTable(Array.getArrayObject(),Array.nombreColumnas);
		
		Ventana.panel_2.add(new JScrollPane(Ventana.tabla));
		Ventana.panel_2.validate();
		
				

		
	}
	
}



class EventoClickBorrar extends JOptionPane implements ActionListener
{
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			int seleccion = Ventana.tabla.getSelectedRow();
			System.out.println("tabla seleccionada es: " + seleccion);
			Array.borrar(Array.getArrayObject(),seleccion);
			
			System.out.println(Array.getArrayString());
			try{
				Ventana.panel_2.removeAll();
				
			}catch(NullPointerException ex)
			{
				System.out.println("Lo ha capturau");
			}
			  
			Ventana.tabla = new JTable(Array.getArrayObject(),Array.nombreColumnas);
			
			Ventana.panel_2.add(new JScrollPane(Ventana.tabla));
			Ventana.panel_2.validate();
			
		}catch(IndexOutOfBoundsException ex)
		{
			JOptionPane.showMessageDialog(null,"No tienes seleccionado ningun registro");
		}
		
		
		
		
		
		
		
		
		
		
		
		/*int[] rows = Ventana.tabla.getSelectedRows();
		   for(int i=0;i<rows.length;i++)
		   {
		     Ventana.model.removeRow(rows[i]-i);
		     fila = rows[i]-i;
		     
		   }*/
		
		   
	}
		

}

