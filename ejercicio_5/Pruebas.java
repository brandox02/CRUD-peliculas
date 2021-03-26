package ejercicio_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pruebas {

	public static void main(String[] args) 
	{
		Object [][] gg  = g(info,1);
		
		System.out.println(getArrayString(gg));
		
		/*
		int x = 0;
		for(String[] e: gg)
		{
			for(int i = 0; i < e.length; i++)
			{
				System.out.println(x+"." + i + " = " + e[i]);
			}
			x++;
		}*/
		
		

	}
	public static String[][] array = new String[][]{new String[]{"a", "b", "c"},new String[]{"d", "e", "f"},new String[]{"g", "h", "i"}};
	public static Object[][] g(Object[][] array,int fila)
	{
		List<Object[]> l = new ArrayList<Object[]>(Arrays.asList(array));

		l.remove(fila);
		String[][] array2 = l.toArray(new String[][]{});
		return array2;
	}
	
	  static String [][] info = 
			{
			    {"Laura","9","8","10","10","10","10","20}"},
			    {"Pedro","10","50","10","35","10","10","90"},
			    {"Luis","10","60","10","70","10","41","17"},
			    {"Mario","10","10","10","43","10","10","23"},
			    {"Blanca","10","89","41","10","10","85","17"}
			};

			public static String getArrayString(Object [][] h)
			{
				String cadena = "";
				
				for (int x=0; x < h.length; x++)
				{
			        for (int y=0; y < h[x].length; y++)
			              cadena += x +"." + y + " - "+ h[x][y] + "\n";
			       
				}
				return cadena;
			}

}
