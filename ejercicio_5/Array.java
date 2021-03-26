package ejercicio_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ejercicio_7.Socio;

public class Array 
{
	public static String[] nombreColumnas = {"Libro","Original","Prestable"};
	private  static Object [][] datosFilas = new Object [0][0];
	
	// metodo magico que hace que a un array bidimensional se le puedan anadir elementos como que de una lista se tratara
	public static void  add(Libros libro)
	{ 
		
		Object[][] respaldo = new Object [datosFilas.length + 1][3];
		for (int x=0; x < datosFilas.length; x++)
		{
	        for (int y=0; y < datosFilas[x].length; y++)
	                respaldo[x][y] = datosFilas[x][y] ;
		}
		respaldo[respaldo.length - 1] = convertToArray(libro);
		datosFilas = respaldo;	
		
	}
	public static String getArrayString()
	{
		String cadena = "";
		
		for (int x=0; x < datosFilas.length; x++)
		{
	        for (int y=0; y < datosFilas[x].length; y++)
	              cadena += x +"." + y + " - "+ datosFilas[x][y] + "\n";
	       
		}
		return cadena;
	}
	public static  Object[][] getArrayObject()
	{
		return datosFilas;
	}
	
	private static Object[] convertToArray(Libros libro)
	{
		Object[] array = {libro.getNombre(),libro.isOriginal(),libro.isPrestable()};
		
		return array;
	}
	public static void reiniciarArray()
	{	
		Object[][] borracion = new Object[0][0];
		datosFilas = borracion;
	}
	
	// este metodo magico lo que hace es borrar la fila del array bidimensional que le pongas como parametro
	public static Object[][] borrar(Object[][] array,int fila)
	{
		List<Object[]> l = new ArrayList<Object[]>(Arrays.asList(array));
		l.remove(fila);
		Object[][] array2 = l.toArray(new Object[][]{});
		datosFilas = array2;
		return array2;
	}
     
	  

}



